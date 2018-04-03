package footballgame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FanTest {

    @BeforeAll
    public void setUp() {
        FootballGame game = new FootballGame();
        game.addFan(new Fan("A"));
        game.addFan(new Fan("B"));
    }

    @Test
    public void shouldReturnYayToTeamGoal() {

        assertEquals("Yay", new Fan("A").reactToGoal("A"));
        assertEquals("Yay", new Fan("B").reactToGoal("B"));
    }

    @Test
    public void shouldReturnBooToTeamGoal() {

        assertEquals("Boo", new Fan("A").reactToGoal("B"));
        assertEquals("Boo", new Fan("B").reactToGoal("A"));
    }


}
