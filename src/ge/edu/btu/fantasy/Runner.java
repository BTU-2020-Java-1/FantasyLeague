package ge.edu.btu.fantasy;

import ge.edu.btu.fantasy.event.Event;
import ge.edu.btu.fantasy.footballer.*;
import ge.edu.btu.fantasy.team.Team;

public class Runner {

    private static Footballer goalkeeper1 = new Goalkeeper(1, "Goalkeeper 1");
    private static Footballer goalkeeper2 = new Goalkeeper(1, "Goalkeeper 2");
    private static Footballer goalkeeper3 = new Goalkeeper(1, "Goalkeeper 3");

    private static Footballer defender1 = new Defender(2, "Defender 1");
    private static Footballer defender2 = new Defender(2, "Defender 2");
    private static Footballer defender3 = new Defender(2, "Defender 3");

    private static Footballer midfielder1 = new Midfielder(3, "Midfielder 1");
    private static Footballer midfielder2 = new Midfielder(3, "Midfielder 2");
    private static Footballer midfielder3 = new Midfielder(3, "Midfielder 3");

    private static Footballer forward1 = new Forward(4, "Forward 1");
    private static Footballer forward2 = new Forward(4, "Forward 2");
    private static Footballer forward3 = new Forward(4, "Forward 3");

    private static Team team1 = new Team("Team 1");
    private static Team team2 = new Team("Team 2");
    private static Team team3 = new Team("Team 3");

    private static Event event1 = new Event(team1, team2);
    private static Event event2 = new Event(team2, team3);
    private static Event event3 = new Event(team3, team1);

    private static FantasyTeam fantasyTeam = new FantasyTeam("Fantasy Team");

    public static void main(String[] args) {
        addTestFootballersInTeams();
        initFantasyTeam();
        addGoalForEvents();

        System.out.println("ჩემი გუნდის მთლიანი ქულების რაოდენობაა " + fantasyTeam.getTotalPoints());
    }

    private static void addGoalForEvents() {
        event1.addGoal(true, 4, 3);
        event1.addGoal(true, 4, 2);
        event1.addGoal(false, 3, 4);
        event2.addGoal(true, 2, 3);
        event2.addGoal(true, 1, 3);
        event3.addGoal(false, 3, 4);
    }

    private static void initFantasyTeam() {
        fantasyTeam.addFootballer(goalkeeper3);
        fantasyTeam.addFootballer(forward2);
        fantasyTeam.addFootballer(forward1);
    }

    private static void addTestFootballersInTeams() {
        team1.addFootballer(goalkeeper1);
        team1.addFootballer(defender1);
        team1.addFootballer(midfielder1);
        team1.addFootballer(forward1);

        team2.addFootballer(goalkeeper2);
        team2.addFootballer(defender2);
        team2.addFootballer(midfielder2);
        team2.addFootballer(forward2);

        team3.addFootballer(goalkeeper3);
        team3.addFootballer(defender3);
        team3.addFootballer(midfielder3);
        team3.addFootballer(forward3);
    }
}
