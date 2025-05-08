package application;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import de.skuzzle.test.snapshots.Snapshot;
import de.skuzzle.test.snapshots.SnapshotTestOptions;
import de.skuzzle.test.snapshots.SnapshotTestOptions.DiffFormat;
import de.skuzzle.test.snapshots.SnapshotTestOptions.NormalizeLineEndings;
import de.skuzzle.test.snapshots.data.json.JsonSnapshot;
import de.skuzzle.test.snapshots.junit5.EnableSnapshotTests;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import schema.Schema;
import utils.TestUtils;
import workshoplinks.Journey;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@EnableSnapshotTests
@SnapshotTestOptions(diffFormat = DiffFormat.SPLIT, normalizeLineEndings = NormalizeLineEndings.GIT)
// Uncomment to update snapshots
//@de.skuzzle.test.snapshots.ForceUpdateSnapshots
public class ApplicationIT {
    static Process mainService;
    static WireMockServer analyticsService;
    static final HttpClient testClient = HttpClient.newHttpClient();

    @BeforeAll
    static void setUp() {
        mainService = startMainServiceInSeparateJVM();
        analyticsService = startAnalyticsService();
    }

    @AfterAll
    static void tearDown() {
        if (mainService != null) {
            mainService.destroy();
        }
        if (analyticsService != null) {
            analyticsService.stop();
        }
    }

    /// @see Journey#DemoApplication
    @Test
    void demoApplication() {
        analyticsService.resetRequests();
        final var data = TestUtils.newSchemaData();
        final var resp = callMainServiceWithData(data);
        assertEquals(200, resp.statusCode(), "Response code was not 200");
    }

    private static final int ITERATIONS = 25_000;

    /// Notice that this is just the basic [#demoApplication()] test just slightly modified.
    ///
    /// The reason we call this a "millibenchmark" is that:
    /// - It isn't a microbenchmark really as it isn't as laser focused as a microbenchmark usually is.
    /// - It isn't a load test either, it runs in a much less controlled environment in a more ad-hoc manner.
    /// So it is something between a microbenchmark and a load test.
    ///
    /// @see Journey#MillibenchmarkingInANutshell
    /// @see Journey#RunMillibenchmarkAndIdentifyTheBottleneck
    /// Q/A: By show of hands:
    /// - Who has microbenchmarked before?
    /// - Who has load testing in their current services?
    /// - Who has used a similar approach to this before?
    @Disabled // Makes sense to have it be opted into
    @RepeatedTest(value = ITERATIONS, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void millibenchmark() {
        final var data = TestUtils.newSchemaData();
        final var resp = callMainServiceWithData(data);
        assertEquals(200, resp.statusCode(), "Response code was not 200");
    }

    /// Snapshot testing can be used to snapshot behavior in time for all sorts of things:
    /// - Method return values
    /// - API requests/responses (including downstream/upstream interactions)
    /// - Diffs between two snapshots (failure and success written data diff)
    /// - etc.
    ///
    /// In this integration test, we actually snapshot the request we make towards the analytics service from the main
    /// service. In the real world, this could be capturing requests going out to many other services and snapshotting
    /// the many details of those interactions.
    ///
    /// @see Journey#DemoSnapshotTestDevLoop3
    @Test
    @SneakyThrows
    void snapshotTest(final Snapshot snapshot) {
        analyticsService.resetRequests();
        final var data = TestUtils.newUniqueSchemaData();
        final var resp = callMainServiceWithData(data);
        assertEquals(200, resp.statusCode(), "Response code was not 200");

        final var startTime = System.currentTimeMillis();
        List<Schema> requestBodiesSentToAnalyticsService;
        while (true) {
            requestBodiesSentToAnalyticsService = analyticsService.getServeEvents()
                    .getServeEvents()
                    .stream()
                    .map(ServeEvent::getRequest)
                    .sorted(Comparator.comparing(LoggedRequest::getLoggedDate))
                    .map(LoggedRequest::getBodyAsString)
                    .map(this::parseToSchema)
                    .toList();
            if (!requestBodiesSentToAnalyticsService.isEmpty()) {
                break;
            }
            if (System.currentTimeMillis() - startTime > 10_000) {
                throw new RuntimeException("Timeout waiting for analytics service to receive request");
            }
        }

        snapshot.named("analyticsService.analyticsStarted.request")
                .assertThat(requestBodiesSentToAnalyticsService)
                .as(JsonSnapshot.json(TestUtils.omFromProd))
                .matchesSnapshotStructure();
        snapshot.named("mainService.process.response")
                .assertThat(this.parseToSchema(resp.body()))
                .as(JsonSnapshot.json(TestUtils.omFromProd))
                .matchesSnapshotStructure();
    }

    /// Notice that for demonstrative purposes we simply run a raw subprocess to start the main service .jar without any
    /// special library or containers to handle that.
    ///
    /// The actual point is that wherever and however, your application.jar is run, you can pass it java flight recorder
    /// parameters to collect profiling information.
    ///
    /// @see Journey#JavaFlightRecorderInANutshell
    /// Q/A: By show of hands:
    /// - Who has used Java Flight Recorder before?
    /// - Who has used other profiling tools before?
    /// - Who has used profiling in production before?
    @SneakyThrows
    private static Process startMainServiceInSeparateJVM() {
        // NOTE: Assumes a compatible java version is on your system path (17+)
        final var applicationProcessBuilder = new ProcessBuilder("java",
                "-jar",
                "-Xms4G",
                "-Xmx4G",
                // On application exit, the profiling info will be dumped into profile.jfr file.
                // Double-click on this file in IntelliJ to load the profiling info into your IDE!
                "-XX:StartFlightRecording=filename=profile.jfr,dumponexit=true",
                // Can configure various details about how the profiling is done exactly.
                "-XX:FlightRecorderOptions=stackdepth=4096",
                Paths.get("target", "digit2025smartertesting-1.0-SNAPSHOT.jar").toString());
        applicationProcessBuilder.redirectErrorStream(true);

        Process applicationProcess = applicationProcessBuilder.start();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(applicationProcess.getInputStream()))) {
            String line;
            boolean appStarted = false;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if (line.contains("Started Application in")) {
                    appStarted = true;
                    break;
                }
            }
            assertTrue(appStarted, "Application did not start successfully.");
        } catch (Exception e) {
            applicationProcess.destroy();
            throw e;
        }
        return applicationProcess;
    }

    @SneakyThrows
    private HttpResponse<String> callMainServiceWithData(final Schema schema) {
        final var requestBody = BodyPublishers.ofString(TestUtils.toJson(schema));
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8185/process"))
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .POST(requestBody)
                .build();
        return testClient.send(request, BodyHandlers.ofString());
    }

    @SneakyThrows
    private Schema parseToSchema(final String body) {
        return TestUtils.omFromProd.readValue(body, Schema.class);
    }

    private static WireMockServer startAnalyticsService() {
        analyticsService = new WireMockServer(wireMockConfig().port(8184)
                .asynchronousResponseEnabled(true)
                .containerThreads(8)
                .maxRequestJournalEntries(1));
        analyticsService.start();
        WireMock.configureFor("localhost", 8184);
        analyticsService.stubFor(WireMock.post("/startAnalytics").willReturn(WireMock.aResponse().withStatus(200)));
        return analyticsService;
    }
}
