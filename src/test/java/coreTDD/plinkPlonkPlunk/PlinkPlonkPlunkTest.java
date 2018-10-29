package coreTDD.plinkPlonkPlunk;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class PlinkPlonkPlunkTest {

    private PlinkPlonkPlunk plinkPlonkPlunk = new PlinkPlonkPlunk();

    @Test
    public void for_1_returns_1() {
        assertThat(plinkPlonkPlunk.findTheSound(1)).isEqualTo("1");
    }

    @Test
    public void for_3_returns_Plink() {
        assertThat(plinkPlonkPlunk.findTheSound(3)).isEqualTo("Plink");
    }

    @Test
    public void for_5_returns_Plonk() {
        assertThat(plinkPlonkPlunk.findTheSound(5)).isEqualTo("Plonk");
    }

    @Test
    public void for_7_returns_Plunk() {
        assertThat(plinkPlonkPlunk.findTheSound(7)).isEqualTo("Plunk");
    }

    @Test
    public void for_3_and_5_divisible_returns_PlinkPlonk() {
        assertThat(plinkPlonkPlunk.findTheSound(15)).isEqualTo("PlinkPlonk");
    }

    @Test
    public void for_3_and_7_divisible_returns_PlinkPlunk() {
        assertThat(plinkPlonkPlunk.findTheSound(21)).isEqualTo("PlinkPlunk");
    }

    @Test
    public void for_5_and_7_divisible_returns_PlonkPlunk() {
        assertThat(plinkPlonkPlunk.findTheSound(35)).isEqualTo("PlonkPlunk");
    }

    @Test
    public void for_3_5_and_7_divisible_returns_PlinkPlonkPlunk() {
        int abs = Math.abs(new Random().nextInt(100));
        int value = 3 * 5 * 7 * abs;

        assertThat(plinkPlonkPlunk.findTheSound(value)).isEqualTo("PlinkPlonkPlunk");
    }
}