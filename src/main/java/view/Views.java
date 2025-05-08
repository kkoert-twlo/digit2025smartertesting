package view;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import workshoplinks.Guidance;

/// @see Guidance#IntroToViewFiltering
public interface Views {
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface AnalyticsDataView {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface OperationalDataView {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface ProcessingDataView1 {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface ProcessingDataView2 {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface ProcessingDataView3 {
    }
}
