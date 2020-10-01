package ge.edu.btu.fantasy.team;

import ge.edu.btu.fantasy.exceptions.FantasyLeagueException;
import ge.edu.btu.fantasy.footballer.Footballer;

import java.util.Objects;

public class Team {

    private String name;

    private Footballer[] footballers = new Footballer[20];

    private int footballerAmount;

    public Team() {}

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFootballer(Footballer footballer) {
        footballers[footballerAmount] = footballer;
        footballerAmount++;
    }

    public Footballer getFootballerByNumber(int number) throws FantasyLeagueException {
        for (int i = 0; i < footballerAmount; i++) {
            if (footballers[i].getNumber() == number) {
                return footballers[i];
            }
        }
        throw new FantasyLeagueException("Can't find footballer with number " + number);
    }

    public void increaseCleanSheetsAmountForAllPlayer() {
        for (int i = 0; i < footballerAmount; i++) {
            footballers[i].increaseCleanSheets();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }
}
