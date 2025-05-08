package workshoplinks;

public enum Solutions {
    /// A straight forward implementation:
    /// ```
    ///     private static final ConcurrentMap<Pair<Field, Class<? extends Annotation>>, Boolean> hasAnnotationCache =
    ///             new ConcurrentHashMap<>();
    ///
    ///     private boolean hasAnnotation(final Field field, final Class<? extends Annotation> viewAnnotation){
    ///         final Pair<Field, Class<? extends Annotation>> annotationCheckKey = Pair.of(field, viewAnnotation);
    ///         return hasAnnotationCache.computeIfAbsent(annotationCheckKey, key -> field.isAnnotationPresent(viewAnnotation));
    ///}
    ///```
    /// Could side-by-side with profiling:
    /// ```
    /// final var hasAnnotationCached2 = !nextField.isAnnotationPresent(viewAnnotation);
    /// final var hasAnnotationCached1 = !hasAnnotation(nextField, viewAnnotation);
    ///
    /// if (hasAnnotationCached1 && hasAnnotationCached2){
    ///     continue;
    ///}
    ///```
    /// Doesn't seem like a winner, can you optimize it further? Is anything broken? :)
    ExtraCreditCouldWeCacheTheAnnotationChecking,

    /// What you can do is:
    /// 1. choose a more optimized serialization library
    /// 2. implement it
    /// 3. use snapshot testing to check compatibility
    /// 4. use the millibenchmark to understand if the new library is more performant or not
    ExtraCreditCouldWeUseAMoreOptimizedSerializer,

    /// Can just add .setSerializationInclusion(JsonInclude.Include.NON_NULL)
    /// Then need to review and update any affected snapshot tests.
    /// You can also check your millibenchmark if it had any noticeable effect on performance there?
    DisableNullSerializationOverTheWire,
}
