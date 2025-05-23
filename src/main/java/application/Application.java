package application;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import operations.Operations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import schema.Schema;
import view.Views;
import workshoplinks.Journey;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

/// @see Journey#IntroToApplication
@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    @RequestMapping("/")
    public static class ApiController {
        /// Let's disable null inclusion to optimize payloads over the wire.
        /// Then fix snapshot tests that start failing.
        ///
        /// @see Journey#DemoSnapshotTestDevLoop4
        public static final ObjectMapper jsonMapper = JsonMapper.builder()
                .disable(MapperFeature.AUTO_DETECT_CREATORS)
                .disable(MapperFeature.AUTO_DETECT_FIELDS)
                .disable(MapperFeature.AUTO_DETECT_GETTERS)
                .disable(MapperFeature.AUTO_DETECT_SETTERS)
                .enable(INDENT_OUTPUT) // this is just for illustrative purposes
                .build();
        private static final HttpClient analyticsServiceClient = HttpClient.newHttpClient();
        private static final HttpRequest.Builder analyticsServiceRequestBuilder = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8184/startAnalytics"))
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");

        /// @see Journey#ReiterateInTLDR
        /// Q/A: Any bets on where the bottleneck will be? :)
        @PostMapping("/process")
        public Schema process(final @RequestBody Schema data) {
            try {
                final var analyticsData = Operations.asView(data, Views.AnalyticsDataView.class);
                handleAnalyticsData(analyticsData); // network call into another service
                final var processingData1 = Operations.asView(data, Views.ProcessingDataView1.class);
                handleProcessingData1(processingData1); // local processing
                final var processingData2 = Operations.asView(data, Views.ProcessingDataView2.class);
                handleProcessingData2(processingData2); // local processing
                final var processingData3 = Operations.asView(data, Views.ProcessingDataView3.class);
                handleProcessingData3(processingData3); // local processing
                final var operationalData = Operations.asView(data, Views.OperationalDataView.class);
                return handleOperationalData(operationalData); // local processing
            } catch (Exception e) {
                log.error("Error processing data", e);
                throw e;
            }
        }

        @SneakyThrows
        private void handleAnalyticsData(final Schema analyticsData) {
            final var body = BodyPublishers.ofString(jsonMapper.writeValueAsString(analyticsData));
            final var request = analyticsServiceRequestBuilder.POST(body).build();
            final var response = analyticsServiceClient.send(request, HttpResponse.BodyHandlers.discarding());
            if (response.statusCode() != 200) {
                log.error("Error processing analytics data");
            }
        }

        private Schema handleOperationalData(final Schema operationalData) {
            // (sparkles) Imagine interesting processing here (sparkles)
            emulateCpuLoad();
            return operationalData;
        }

        private void handleProcessingData1(final Schema processingData1) {
            // (sparkles) Imagine interesting processing here (sparkles)
            emulateCpuLoad();
        }

        private void handleProcessingData2(final Schema processingData2) {
            // (sparkles) Imagine interesting processing here (sparkles)
            emulateCpuLoad();
        }

        private void handleProcessingData3(final Schema processingData3) {
            // (sparkles) Imagine interesting processing here (sparkles)
            emulateCpuLoad();
        }

        private void emulateCpuLoad() {
            double result = 0.0;
            // Perform a CPU-intensive calculation
            for (int i = 0; i < 1000; i++) {
                result += Math.sqrt(i) * Math.sin(i);
            }
        }
    }
}