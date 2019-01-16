package kotlinCoreTDDTests.tennis

import kotlinCoreTDD.tennis.TennisMatch
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class TennisMatchTest {

    @Test
    fun theInitialScoreIs_Love_all() {
        assertThat(TennisMatch().getScore()).isEqualTo("Love-all")
    }
}