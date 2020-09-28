package ge.edu.btu.fantasy.event;

import ge.edu.btu.fantasy.footballer.Footballer;
import ge.edu.btu.fantasy.team.Team;

public class Event implements IEvent {

    private Team homeTeam;

    private Team awayTeam;

    private int homeTeamGoalsAmount;

    private int awayTeamGoalsAmount;

    public Event() {}

    public Event(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public void addGoal(boolean homeTeamGoal, int goalNumber, int assistNumber) {
        if (homeTeamGoal) {
            Footballer goalFootballer = homeTeam.getFootballerByNumber(goalNumber);
            goalFootballer.increaseGoals();
            Footballer assistFootballer = homeTeam.getFootballerByNumber(assistNumber);
            assistFootballer.increaseAssists();
            homeTeamGoalsAmount++;
        } else {
            Footballer goalFootballer = awayTeam.getFootballerByNumber(goalNumber);
            goalFootballer.increaseGoals();
            Footballer assistFootballer = awayTeam.getFootballerByNumber(assistNumber);
            assistFootballer.increaseAssists();
            awayTeamGoalsAmount++;
        }
    }

    @Override
    public void finish() {
        if (homeTeamGoalsAmount == 0) {
            awayTeam.increaseCleanSheetsAmountForAllPlayer();
        }
        if (awayTeamGoalsAmount == 0) {
            homeTeam.increaseCleanSheetsAmountForAllPlayer();
        }
    }
}
