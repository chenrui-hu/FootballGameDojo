package footballgame;

import java.util.ArrayList;

public class FootballGame {

    ArrayList<Reporter> reporter = new ArrayList<>();
    ArrayList<Fan> fans = new ArrayList<>();
    ArrayList<ScoreBoard> scoreBoards = new ArrayList<>();

    public FootballGame(){

    }

    public void addScoreBoard(ScoreBoard scoreboard) {
        this.scoreBoards.add(scoreboard);
    }

    public void addReporter(Reporter reporter) {
        this.reporter.add(reporter);
    }

    public void addFan(Fan fan) {
        this.fans.add(fan);
    }

    public void teamScored(String scoringTeam) {
        // implementation here
        for(Reporter repo : reporter) {
            repo.reactToGoal(scoringTeam);


        }
        for(Fan fan : fans) {
            fan.reactToGoal(scoringTeam);
        }

        for(ScoreBoard scoreBoard : scoreBoards) {
            scoreBoard.reactToGoal(scoringTeam);
        }

    }
}
