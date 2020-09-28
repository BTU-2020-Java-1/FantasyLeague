package ge.edu.btu.fantasy.footballer;

public class Goalkeeper extends Footballer {

    private static final int GOALS_RANK = 8;
    private static final int ASSISTS_RANK = 5;
    private static final int CLEAN_SHEETS_RANK = 4;

    public Goalkeeper() {}

    public Goalkeeper(int number, String name) {
        super(number, name);
    }

    @Override
    public int getPoints() {
        return getGoals() * GOALS_RANK +
                getAssists() * ASSISTS_RANK +
                getCleanSheets() * CLEAN_SHEETS_RANK;
    }
}
