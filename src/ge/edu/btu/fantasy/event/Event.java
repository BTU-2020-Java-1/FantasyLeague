package ge.edu.btu.fantasy.event;

import ge.edu.btu.fantasy.exceptions.FantasyLeagueException;
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
            try {
                Footballer goalFootballer = homeTeam.getFootballerByNumber(goalNumber);
                goalFootballer.increaseGoals();
            } catch (FantasyLeagueException ex) {
                System.out.println("დაფიქსირდა შეცდომა: " + ex.getMessage());
            }
            try {
                Footballer assistFootballer = homeTeam.getFootballerByNumber(assistNumber);
                assistFootballer.increaseAssists();
            } catch (FantasyLeagueException ex) {
                System.out.println("დაფიქსირდა შეცდომა: " + ex.getMessage());
            }
            homeTeamGoalsAmount++;
        } else {
            try {
                Footballer goalFootballer = awayTeam.getFootballerByNumber(goalNumber);
                goalFootballer.increaseGoals();
            } catch (FantasyLeagueException ex) {
                System.out.println("დაფიქსირდა შეცდომა: " + ex.getMessage());
            }
            try {
                Footballer assistFootballer = awayTeam.getFootballerByNumber(assistNumber);
                assistFootballer.increaseAssists();
            } catch (FantasyLeagueException ex) {
                System.out.println("დაფიქსირდა შეცდომა: " + ex.getMessage());
            }
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
