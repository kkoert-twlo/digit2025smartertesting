package workshoplinks;

public enum Guidance {
    // Intros/Demos
    IntroToApplication,
    DemoApplication,
    IntroToSchema,
    DemoSchema,
    IntroToViewFiltering,
    DemoViewFiltering,
    ReiterateInTLDR,

    // # Gameplan!
    //
    // 1. Generate interesting test data to be able to work on finding the bottleneck easier!
    // 2. Do some manner of benchmarking to identify where the bottleneck is!
    // 3. Verify your fix!

    // 1. Generating test data
    InstancioInANutshell,
    BackToSchemaDemo,

    // 2. "Millibenchmarking" (TM)
    MillibenchmarkingInANutshell,
    JavaFlightRecorderInANutshell,
    RunMillibenchmarkAndIdentifyTheBottleneck,

    // 3. Verifying the fix
    SnapshotTestingInANutshell,
    DemoSnapshotTestDevLoop1,
    DemoSnapshotTestDevLoop2,
    DemoSnapshotTestDevLoop3,
    DemoSnapshotTestDevLoop4,

    // Extra credit

    // Maybe if we cached the slow reflection-based annotation check, we could speed things up?
    ExtraCreditCouldWeCacheTheAnnotationCheck,

    // Maybe if we switched the serializer library we could get even better performance?
    ExtraCreditCouldWeUseAMoreOptimizedSerializer,
}
