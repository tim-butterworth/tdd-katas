package fizzBuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzerTest {

    @Test
    public void name() {
        assertThat(true).as("This is not a good test").isEqualTo(false);
    }
}