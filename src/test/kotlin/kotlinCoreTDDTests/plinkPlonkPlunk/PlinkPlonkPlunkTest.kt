package kotlinCoreTDDTests.plinkPlonkPlunk

import kotlinCoreTDD.plinkPlonkPlunk.PlinkPlonkPlunk
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PlinkPlonkPlunkTest {

    @Test
    fun returns_Plink_for_3() {
        assertThat(PlinkPlonkPlunk().findTheSound(3)).isEqualTo("Plink")
    }

}