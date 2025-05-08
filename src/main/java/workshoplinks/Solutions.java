package workshoplinks;

public enum Solutions {
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
