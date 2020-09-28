package ge.edu.btu.fantasy.footballer;

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
}
