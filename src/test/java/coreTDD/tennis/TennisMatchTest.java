package coreTDD.tennis;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisMatchTest {

    @Test
    public void a_game_should_begin_love_love() {
        TennisMatch tennisMatch = new TennisMatch();

        assertThat(tennisMatch.getScore()).isEqualTo("Love-all");
    }
}