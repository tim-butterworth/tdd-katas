package kotlinCoreTDDTests.passwordVerifier

import kotlinCoreTDD.passwordVerifier.Password
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PasswordTest {

    @Test
    fun passwordsShorterThan12CharactersAreNotValid() {
        val verificationResult = Password().verify("tooShort")

        assertThat(verificationResult).isFalse()
    }
}