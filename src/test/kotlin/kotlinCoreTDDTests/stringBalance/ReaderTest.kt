package kotlinCoreTDDTests.stringBalance

import kotlinCoreTDD.stringBalance.Reader
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ReaderTest {

    @Test
    fun anEmptyStringIsBalanced() {
        assertThat(Reader().isBalanced("")).isTrue()
    }
}