package footballgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballGameTest {

    private Reporter reporter;
    private FootballGame footballGame;
    private Fan fan;
    private ScoreBoard scoreBoard;

    @BeforeEach
    public void setUp() throws Exception {
        reporter = mock(Reporter.class);
        fan = mock(Fan.class);
        scoreBoard = mock(ScoreBoard.class);
        footballGame = new FootballGame();
        footballGame.addReporter(reporter);
        footballGame.addFan(fan);
        footballGame.addScoreBoard(scoreBoard);
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(reporter).reactToGoal("Team A");
    }

    @Test
    public void fansShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(fan).reactToGoal("Team A");
    }

    @Test
    public void scoreBoardShouldReturn1vs0WhenTeamAScored() {
        footballGame.teamScored("Team A");
        verify(scoreBoard).reactToGoal("Team A");
        footballGame.teamScored("Team B");
        verify(scoreBoard).reactToGoal("Team B");
    }
}
