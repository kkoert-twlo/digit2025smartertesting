package schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import view.Views.AnalyticsDataView;
import view.Views.OperationalDataView;
import view.Views.ProcessingDataView1;
import view.Views.ProcessingDataView2;
import view.Views.ProcessingDataView3;
import workshoplinks.Guidance;

/// @see Guidance#IntroToSchema
@Data
public class Schema {
    @JsonProperty
    @AnalyticsDataView
    @OperationalDataView
    @ProcessingDataView1
    @ProcessingDataView2
    @ProcessingDataView3
    FieldTypeLvl1 rootField;

    @Data
    public static class FieldTypeLvl10 {
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl9 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl10 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl8 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl9 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        /// Let's remove the View here, which changes a field somewhere deep in the Schema.
        ///
        /// @see Guidance#DemoSnapshotTestDevLoop1
        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl7 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl8 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl6 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl7 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl5 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl6 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl4 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl5 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl3 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl4 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl2 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl3 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    @Data
    public static class FieldTypeLvl1 {
        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        FieldTypeLvl2 subField;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field1;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field2;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field3;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field4;

        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field5;

        @JsonProperty
        Integer field6;

        @AnalyticsDataView
        @JsonProperty
        Integer field7;

        @AnalyticsDataView
        @JsonProperty
        Integer field8;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field9;

        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        @JsonProperty
        Integer field10;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field11;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field12;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field13;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field14;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field15;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field16;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field17;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field18;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field19;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field20;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field21;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field22;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field23;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field24;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field25;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field26;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field27;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field28;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field29;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field30;

        @JsonProperty
        @AnalyticsDataView
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field31;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field32;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field33;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field34;

        @JsonProperty
        @AnalyticsDataView
        Integer field35;

        @JsonProperty
        @AnalyticsDataView
        Integer field36;

        @JsonProperty
        @AnalyticsDataView
        Integer field37;

        @JsonProperty
        Integer field38;

        @JsonProperty
        Integer field39;

        @JsonProperty
        Integer field40;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field41;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field42;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field43;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field44;

        @JsonProperty
        @AnalyticsDataView
        Integer field45;

        @JsonProperty
        @AnalyticsDataView
        Integer field46;

        @JsonProperty
        @AnalyticsDataView
        Integer field47;

        @JsonProperty
        @OperationalDataView
        @ProcessingDataView1
        @ProcessingDataView2
        @ProcessingDataView3
        Integer field48;

        @JsonProperty
        @AnalyticsDataView
        Integer field49;

        @JsonProperty
        Integer field50;
    }

    // Map<String, List<Map<Integer, Set<String>>>> intentionallyConvolutedField;
}
