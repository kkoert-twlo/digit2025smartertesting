package schema;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import utils.TestUtils;
import workshoplinks.Journey;

class SchemaTest {
    /// @see Journey#DemoSchema
    /// @see Journey#BackToSchemaDemo
    @Test
    @SneakyThrows
    void demoSchema() {
        var demoInstance = TestUtils.newUniqueSchemaData();
        System.out.println(TestUtils.toJson(demoInstance));
    }
}