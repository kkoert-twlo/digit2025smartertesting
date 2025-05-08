package schema;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import utils.TestUtils;
import workshoplinks.Guidance;

class SchemaTest {
    /// @see Guidance#DemoSchema
    /// @see Guidance#BackToSchemaDemo
    @Test
    @SneakyThrows
    void demoSchema() {
        var demoInstance = TestUtils.newUniqueSchemaData();
        System.out.println(TestUtils.toJson(demoInstance));
    }
}