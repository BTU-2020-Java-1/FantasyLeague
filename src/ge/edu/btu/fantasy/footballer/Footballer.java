package ge.edu.btu.fantasy.footballer;

import java.util.Objects;

public abstract class Footballer {

    private int number;

    private String name;

    private int goals;

    private int assists;

    private int cleanSheets;

    public Footballer() {}

    public Footballer(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void increaseGoals() {
        this.goals++;
    }

    public void increaseAssists() {
        this.assists++;
    }

    public void increaseCleanSheets() {
        this.cleanSheets++;
    }

    public abstract int getPoints();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Footballer that = (Footballer) o;
        return number == that.number &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", goals=" + goals +
                ", assists=" + assists +
                ", cleanSheets=" + cleanSheets +
                '}';
    }
}
