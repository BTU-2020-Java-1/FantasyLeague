package ge.edu.btu.fantasy.team;

import ge.edu.btu.fantasy.footballer.Footballer;

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

    public Footballer getFootballerByNumber(int number) {
        for (int i = 0; i < footballerAmount; i++) {
            if (footballers[i].getNumber() == number) {
                return footballers[i];
            }
        }
        return null;
    }

    public void increaseCleanSheetsAmountForAllPlayer() {
        for (int i = 0; i < footballerAmount; i++) {
            footballers[i].increaseCleanSheets();
        }
    }
}
