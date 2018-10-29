package coreTDD.diamond;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiamondFactoryTest {

    private DiamondFactory diamondFactory = new DiamondFactory();

    @Test
    public void returns_diamond_for_1() {
        assertThat(diamondFactory.constructDiamond(1)).containsExactly("1");
    }
}