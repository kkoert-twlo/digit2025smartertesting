# digit2025smartertesting

This project is an emulation of a theoretical real world project to demonstrate testing patterns and tools.

Specifically, it touches on:

- Generating test input via Instancio
- Generating test expectation via de.skuzzle snapshot testing
- Benchmarking performance via the java flight recorder

## "The story"

After making some recent code changes, your service has suffered a significant reduction in performance.
You've been tasked with investigating what went wrong, fixing the issue and testing the logic!

Start from `src/main/java/workshoplinks/Journey.java` and via "jump to usages in your IDE."

## References

- Instancio https://www.instancio.org/user-guide/
- Snapshot testing https://skuzzle.github.io/snapshot-tests/reference/latest/
- Java Flight Recorder https://docs.oracle.com/javacomponents/jmc-5-4/jfr-runtime-guide/about.htm
