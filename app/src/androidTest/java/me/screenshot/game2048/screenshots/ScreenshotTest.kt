package me.screenshot.game2048.screenshots

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.view.View
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers
import me.veryyoung.game2048.*
import org.junit.Rule
import org.junit.Test


class ScreenshotTest {
    @get:Rule
    var activityTestRule = ActivityTestRule<NewActivity>(NewActivity::class.java, false, false)

    @Test
    fun test_Snapshot_With_Activity() {
        val activity = activityTestRule.launchActivity(null)
        val question = activity.findViewById<View>(R.id.question)

        Screenshot.snapActivity(activity).setName("whole_activity").record()
        Screenshot.snap(question).setName("question").record()
    }

    @Test
    fun test_Snapshot() {
        val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
        val view = MainView(targetContext)
        view.game.grid.clearGrid()
        val tile = Tile(Cell(1, 1), 2)
        view.game.grid.insertTile(tile)
        view.game.score = 12345678

        ViewHelpers.setupView(view).setExactWidthDp(300).setExactHeightDp(500).layout().draw()
        Screenshot.snap(view).setName("2048").record()
    }

}