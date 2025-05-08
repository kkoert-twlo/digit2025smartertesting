package workshoplinks;

public enum Journey {
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

    // Q/A round or Story time

    // Questions/Stories:
    // - Where would you use snapshot testing?
    //   - Who has the service with the highest number of integration to other services?
    // - Where would you use Instancio (or similar)?
    //   - Who has operations that have to run over large data structures with nullable data?
    // - How would you optimize the current millibenchmark for better load generation?
    // - The Twilio story with a large schema, reflection logic, code generation and snapshot testing.
}
