package operations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import workshoplinks.Journey;

/// @see Journey#IntroToViewFiltering
@Slf4j
public class ViewFiltering {

    @SneakyThrows
    public <T> T asView(final T originalInstance, final Class<? extends Annotation> viewAnnotation) {
        if (originalInstance == null) {
            return null;
        }

        if (isImmutableClass(originalInstance.getClass())) {
            return originalInstance;
        }

        final var filteredInstance = originalInstance.getClass().getConstructor().newInstance();
        for (final Field nextField : originalInstance.getClass().getDeclaredFields()) {
            nextField.setAccessible(true);

            if (!nextField.isAnnotationPresent(viewAnnotation)) {
                continue;
            }

            final var originalVal = nextField.get(originalInstance);
            final var filteredVal = asView(originalVal, viewAnnotation);
            nextField.set(filteredInstance, filteredVal);

            final var annotationInstance = nextField.getAnnotation(viewAnnotation);
            if (annotationInstance != null) {
                handleWarnOnNull(annotationInstance, originalVal);
            }
        }

        //noinspection unchecked
        return (T) filteredInstance;
    }

    private void handleWarnOnNull(final Annotation viewAnnotationInstance, final Object fieldVal) {
        try {
            final var warnOnNullField = viewAnnotationInstance.getClass().getField("warnOnNullValue");
            final var warnOnNullValue = (Boolean) warnOnNullField.get(viewAnnotationInstance);
            if (warnOnNullValue && fieldVal == null) {
                final var fieldName = warnOnNullField.getName();
                log.warn("Field '{}' is null in view '{}'",
                        fieldName,
                        viewAnnotationInstance.annotationType().getSimpleName());
            }
        } catch (NoSuchFieldException e) {
            // noop
        } catch (IllegalAccessException e) {
            log.warn("warnOnNull field not accessible", e);
        }
    }

    private boolean isImmutableClass(final Class<?> clazz) {
        return clazz.isPrimitive() ||
                clazz == String.class ||
                clazz == Integer.class ||
                clazz == Long.class ||
                clazz == Boolean.class ||
                clazz == Double.class ||
                clazz == Float.class ||
                clazz == Short.class ||
                clazz == Byte.class ||
                clazz == Character.class;
    }
}
