package plinkPlonkPlunk;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlinkPlonkPlunkTest {

    private PlinkPlonkPlunk plinkPlonkPlunk = new PlinkPlonkPlunk();

    @Test
    public void throwAwayTest() {
        assertThat(plinkPlonkPlunk.findTheSound(1)).isEqualTo("1");
    }
}