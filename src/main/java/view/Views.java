package view;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import workshoplinks.Guidance;

/// @see Guidance#IntroToViewFiltering
public interface Views {
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface AnalyticsDataView {
    }

    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface OperationalDataView {
    }
}
