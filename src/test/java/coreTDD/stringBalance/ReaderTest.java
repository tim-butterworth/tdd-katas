package coreTDD.stringBalance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class ReaderTest {

    private final Reader reader = new Reader();

    private final String message;
    private final String stringToTest;
    private final Boolean expected;

    public ReaderTest(String message, String stringToTest, Boolean expected) {
        this.message = message;
        this.stringToTest = stringToTest;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters() {
        return new Object[][]{
                {"empty string is balanced", "", true},
        };
    }

    @Test
    public void testWithParameters() {
        assertThat(reader.isBalanced(stringToTest))
                .as(message)
                .isEqualTo(expected);
    }
}