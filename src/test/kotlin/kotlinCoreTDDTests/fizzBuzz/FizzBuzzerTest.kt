package kotlinCoreTDDTests.fizzBuzz

import kotlinCoreTDD.fizzBuzz.FizzBuzzer
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzerTest {

    @Test
    fun fizzBuzz_returns_Buzz_for_3() {
        assertThat(FizzBuzzer().execute(3)).isEqualTo("Buzz")
    }
}