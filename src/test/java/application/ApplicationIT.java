package application;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import de.skuzzle.test.snapshots.Snapshot;
import de.skuzzle.test.snapshots.SnapshotTestOptions;
import de.skuzzle.test.snapshots.SnapshotTestOptions.DiffFormat;
import de.skuzzle.test.snapshots.data.json.JsonSnapshot;
import de.skuzzle.test.snapshots.junit5.EnableSnapshotTests;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import schema.Schema;
import utils.TestUtils;
import workshoplinks.Guidance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Execution(ExecutionMode.CONCURRENT)
@EnableSnapshotTests
@SnapshotTestOptions(diffFormat = DiffFormat.SPLIT)
// Uncomment to update snapshots
@de.skuzzle.test.snapshots.ForceUpdateSnapshots
public class ApplicationIT {
    static Process mainService;
    static WireMockServer analyticsService;
    static final HttpClient testClient = HttpClient.newHttpClient();

    @BeforeAll
    static void setUp() {
        mainService = startMainServiceInSeparateJVM();
        analyticsService = new WireMockServer(8184);
        analyticsService.start();
        WireMock.configureFor("localhost", 8184);

        analyticsService.stubFor(WireMock.post("/startAnalytics")
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"message\":\"analysisStarted\"}")));
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

    @BeforeEach
    void resetWireMock() {
        analyticsService.resetRequests();
    }

    /// @see Guidance#DemoApplication
    @Test
    void demoApplication() {
        final var data = TestUtils.newSchemaData();
        data.setIsOptedIntoAnalytics(true); // force interaction
        final var resp = callMainServiceWithData(data);
        assertEquals(200, resp.statusCode(), "Response code was not 200");
    }

    private static final int ITERATIONS = 25_000;

    /// Notice that this is just the basic [#demoApplication()] test just slightly modified and:
    /// - Run via @RepeatedTests for many loops
    /// - Class also uses @Execution(ExecutionMode.CONCURRENT) to generate more load
    /// - There is also a junit-platform.properties file to configure the parallelism
    ///
    /// The reason we call this a "millibenchmark" is that:
    /// - It isn't a microbenchmark really as it isn't as laser focused as a microbenchmark usually is.
    /// - It isn't a load test either, it runs in a much less controlled environment in a more ad-hoc manner.
    /// So it is something between a microbenchmark and a load test.
    ///
    /// @see Guidance#MillibenchmarkingInANutshell
    /// @see Guidance#RunMillibenchmarkAndIdentifyTheBottleneck
    @RepeatedTest(value = ITERATIONS, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void millibenchmark() {
        final var data = TestUtils.newSchemaData();
        data.setIsOptedIntoAnalytics(false);
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
    /// @see Guidance#DemoSnapshotTestDevLoop3
    @Test
    @SneakyThrows
    void snapshotTest(final Snapshot snapshot) {
        final var data = TestUtils.newUniqueSchemaData();
        data.setIsOptedIntoAnalytics(true); // force interaction with analytics service
        final var resp = callMainServiceWithData(data);
        assertEquals(200, resp.statusCode(), "Response code was not 200");

        final var requestBodiesSentToAnalyticsService = analyticsService.getServeEvents()
                .getServeEvents()
                .stream()
                .map(ServeEvent::getRequest)
                .sorted(Comparator.comparing(LoggedRequest::getLoggedDate))
                .map(LoggedRequest::getBodyAsString)
                .map(this::parseToSchema)
                .toList();

        snapshot.named("analyticsService.analyticsStarted")
                .assertThat(requestBodiesSentToAnalyticsService)
                .as(JsonSnapshot.json(TestUtils.om))
                .matchesSnapshotStructure();
    }

    /// Notice that for demonstrative purposes we simply run a raw subprocess to start the main service .jar without any
    /// special library or containers to handle that.
    ///
    /// The actual point is that wherever and however, your application.jar is run, you can pass it java flight recorder
    /// parameters to collect profiling information.
    ///
    /// @see Guidance#JavaFlightRecorderInANutshell
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
                .uri(URI.create("http://localhost:8183/process"))
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .POST(requestBody)
                .build();
        return testClient.send(request, HttpResponse.BodyHandlers.ofString());
    }

    @SneakyThrows
    private Schema parseToSchema(final String body) {
        return TestUtils.om.readValue(body, Schema.class);
    }
}
