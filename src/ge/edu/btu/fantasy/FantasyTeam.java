package ge.edu.btu.fantasy;

import ge.edu.btu.fantasy.footballer.Footballer;

import java.util.Objects;

public class FantasyTeam {

    private String name;

    private Footballer[] footballers = new Footballer[3];

    private int footballersAmount;

    public FantasyTeam() {}

    public FantasyTeam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFootballer(Footballer footballer) {
        footballers[footballersAmount] = footballer;
        footballersAmount++;
    }

    public int getTotalPoints() {
        int totalPoints = 0;
        for (int i = 0; i < footballersAmount; i++) {
            totalPoints = totalPoints + footballers[i].getPoints();
        }
        return totalPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FantasyTeam that = (FantasyTeam) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "FantasyTeam{" +
                "name='" + name + '\'' +
                '}';
    }
}
