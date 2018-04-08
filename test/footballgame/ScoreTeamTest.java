package footballgame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ScoreTeamTest {

    @Test
    public void shouldReportScore1vs0WhenTeamAScore() {

        assertThat(new ScoreBoard(0, 0).reactToGoal("Team A"), is("1 : 0"));
        assertThat(new ScoreBoard(0, 1).reactToGoal("Team B"), is("0 : 2"));
    }
}
