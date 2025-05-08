package operations;

import java.lang.annotation.Annotation;

import schema.Schema;

public class Operations {
    private final static ViewFiltering viewFiltering = new ViewFiltering();

    public static Schema asView(final Schema originalData, final Class<? extends Annotation> viewAnnotation) {
        return Operations.viewFiltering.asView(originalData, viewAnnotation);
    }
}
