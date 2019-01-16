package kotlinCoreTDDTests.diamond

import kotlinCoreTDD.diamond.DiamondFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DiamondFactoryTest {

    @Test
    fun constructDiamond_for1() {
        assertThat(DiamondFactory().constructDiamond(1)).isEqualTo(arrayOf("1"))
    }
}