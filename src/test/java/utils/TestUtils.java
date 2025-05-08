package utils;

import application.Application;
import application.Application.ApiController;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.instancio.Instancio;
import org.instancio.Model;
import org.instancio.settings.Keys;
import org.instancio.settings.OnSetFieldError;
import schema.Schema;

import static com.fasterxml.jackson.databind.SerializationFeature.*;
import static org.instancio.Select.fields;

public class TestUtils {
    private TestUtils() {
    }

    /// Example of a real world Model:
    ///
    /// ```
    /// // ref: https://www.instancio.org/user-guide/
    /// private static final Model<MDR> ANY_MDR_MODEL_WITH_NULLABLE_FIELDS = Instancio.of(MDR.class)
    ///             // Allowing any field to be null
    ///             .withNullable(fields())
    ///             // Allowing any container elements to be null
    ///             .withSetting(Keys.ARRAY_ELEMENTS_NULLABLE, true)
    ///             .withSetting(Keys.COLLECTION_ELEMENTS_NULLABLE, true)
    ///             .withSetting(Keys.MAP_KEYS_NULLABLE, true)
    ///             .withSetting(Keys.MAP_VALUES_NULLABLE, true)
    ///             // Keep container sizes small - no value in bigger containers
    ///             .withSetting(Keys.COLLECTION_MAX_SIZE, 3)
    ///             .withSetting(Keys.ARRAY_MAX_LENGTH, 3)
    ///             .withSetting(Keys.MAP_MAX_SIZE, 3)
    ///             // Allowing empty containers
    ///             .withSetting(Keys.COLLECTION_MIN_SIZE, 0)
    ///             .withSetting(Keys.ARRAY_MIN_LENGTH, 0)
    ///             .withSetting(Keys.MAP_MIN_SIZE, 0)
    ///             // Keep string lengths small - no value in longer strings
    ///             .withSetting(Keys.STRING_MAX_LENGTH, 3)
    ///             // Allow empty strings. In practice, this does not have any effect on merging itself as strings are
    ///             // immutable.
    ///             .withSetting(Keys.STRING_MIN_LENGTH, 0)
    ///             .withSetting(Keys.STRING_ALLOW_EMPTY, true)
    ///             // Shifting defaults to better defaults just in case. This ensures that we don't silently avoid failures
    ///             // during data generation. In practice, this does not have any effect on merging itself.
    ///             .withSetting(Keys.ON_SET_FIELD_ERROR, OnSetFieldError.FAIL)
    ///             .withSetting(Keys.FAIL_ON_ERROR, true)
    ///             .withMaxDepth(12)
    ///             .toModel();
    ///```
    ///
    /// @see workshoplinks.Guidance#InstancioInANutshell
    public static final Model<Schema> instancioModel = Instancio.of(Schema.class)
            .withSeed(0)
            .withNullable(fields())
            .withSetting(Keys.ON_SET_FIELD_ERROR, OnSetFieldError.FAIL)
            .withSetting(Keys.FAIL_ON_ERROR, true)
            .withMaxDepth(20)
            .toModel();
    public static final ObjectMapper om = ApiController.jsonMapper;

    public static String toJson(Object obj) {
        try {
            return om.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Schema newSchemaData() {
        return Instancio.of(instancioModel).create();
    }

    public static Schema newUniqueSchemaData() {
        final var oneTimeUseModel = Instancio.of(Schema.class)
                .withSeed(0)
                .withSetting(Keys.ON_SET_FIELD_ERROR, OnSetFieldError.FAIL)
                .withSetting(Keys.FAIL_ON_ERROR, true)
                .withMaxDepth(20)
                .toModel();
        return Instancio.of(oneTimeUseModel).create();
    }
}
