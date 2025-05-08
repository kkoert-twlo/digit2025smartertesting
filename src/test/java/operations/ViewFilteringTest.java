package operations;

import de.skuzzle.test.snapshots.Snapshot;
import de.skuzzle.test.snapshots.SnapshotTestOptions;
import de.skuzzle.test.snapshots.SnapshotTestOptions.DiffFormat;
import de.skuzzle.test.snapshots.data.json.JsonSnapshot;
import de.skuzzle.test.snapshots.junit5.EnableSnapshotTests;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import utils.TestUtils;
import view.Views.AnalyticsDataView;
import view.Views.OperationalDataView;

/// Snapshot testing is sort of the inverse of Instancio.
/// - Instancio generates test data.
/// - Snapshot testing generates expectations.
///
/// Snapshot testing CANNOT know "what is the correct expectation".
/// Snapshot testing CAN know "what is the behavior today".
///
/// This makes snapshot testing a fantastic tool for:
/// - regression testing
/// - demonstrating in PRs what the effect of code changes will be
/// - capture massive amounts of fine-grained detail about data
///
/// BONUS: it is ergonomic to work with!
///
/// @see workshoplinks.Guidance#SnapshotTestingInANutshell
@EnableSnapshotTests
@SnapshotTestOptions(diffFormat = DiffFormat.SPLIT)
        /// The test starts failing and gives us a diff of the changes.
        /// If we intended for the changes to happen, we can update snapshots with the ForceUpdateSnapshots annotation.
        ///
        /// @see workshoplinks.Guidance#DemoSnapshotTestDevLoop2
        //@de.skuzzle.test.snapshots.ForceUpdateSnapshots
class ViewFilteringTest {
    ViewFiltering viewFiltering = new ViewFiltering();

    /// @see workshoplinks.Guidance#DemoViewFiltering
    @Test
    @SneakyThrows
    void demoViewFiltering(final Snapshot snapshot) {
        final var initialData = TestUtils.newUniqueSchemaData();
        final var analyticsViewData = viewFiltering.asView(initialData, AnalyticsDataView.class);
        final var operationalViewData = viewFiltering.asView(initialData, OperationalDataView.class);

        snapshot.named("demoViewFiltering.initialData")
                .assertThat(initialData)
                .as(JsonSnapshot.json())
                .matchesSnapshotStructure();

        snapshot.named("demoViewFiltering.analyticsViewData")
                .assertThat(analyticsViewData)
                .as(JsonSnapshot.json())
                .matchesSnapshotStructure();

        snapshot.named("demoViewFiltering.operationalViewData")
                .assertThat(operationalViewData)
                .as(JsonSnapshot.json())
                .matchesSnapshotStructure();
    }
}