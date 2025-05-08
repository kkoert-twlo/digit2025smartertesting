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
    //    Via Instancio!
    // 2. Do some manner of benchmarking to identify where the bottleneck is!
    //    Via "Millibenchmarking"!
    // 3. Verify your fix!
    //    Via Snapshot testing!

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

    // Maybe if we switched the serializer library we could get even better performance?
    ExtraCreditCouldWeUseAMoreOptimizedSerializer,
}
