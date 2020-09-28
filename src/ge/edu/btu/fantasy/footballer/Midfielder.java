package ge.edu.btu.fantasy.footballer;

public class Midfielder extends Footballer {

    private static final int GOALS_RANK = 5;
    private static final int ASSISTS_RANK = 3;
    private static final int CLEAN_SHEETS_RANK = 1;

    public Midfielder() {}

    public Midfielder(int number, String name) {
        super(number, name);
    }

    @Override
    public int getPoints() {
        return getGoals() * GOALS_RANK +
                getAssists() * ASSISTS_RANK +
                getCleanSheets() * CLEAN_SHEETS_RANK;
    }
}
