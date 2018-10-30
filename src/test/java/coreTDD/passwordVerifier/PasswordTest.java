package coreTDD.passwordVerifier;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordTest {

    @Test
    public void garbageTest() {
        assertThat(true).as("This is a garbage test!").isFalse();
    }
}