package footballgame;

public class ScoreBoard implements Spectator {

    private int TeamAScore;
    private int TeamBScore;
    private String score;

    public ScoreBoard(int scoreA, int scoreB) {
        this.TeamAScore = scoreA;
        this.TeamBScore = scoreB;
    }

    @Override
    public String reactToGoal(String scoreTeam) {
        if(scoreTeam.equals("Team A")) {
            TeamAScore += 1;
        }
        else {
            TeamBScore += 1;
        }
        score = String.valueOf(TeamAScore) + " : " + String.valueOf(TeamBScore);
        return score;
    }
}
