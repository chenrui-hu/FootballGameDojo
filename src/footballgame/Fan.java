package footballgame;

public class Fan implements Spectator {

    private String team;

    public Fan(String team) {
        this.team = team;
    }

    @Override
    public String reactToGoal(String scoringTeam) {
        if (this.team.equals(scoringTeam)) {
            return "Yay";
        }
        return "Boo";
    }
}
