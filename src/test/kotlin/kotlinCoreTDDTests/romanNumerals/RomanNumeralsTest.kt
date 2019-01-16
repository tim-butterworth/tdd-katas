package kotlinCoreTDDTests.romanNumerals

import kotlinCoreTDD.romanNumerals.toNumber
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RomanNumeralsTest {

    @Test
    fun converts_I_to_1() {
        assertThat(toNumber("I")).isEqualTo(1)
    }

}