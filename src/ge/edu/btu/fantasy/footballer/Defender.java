package ge.edu.btu.fantasy.footballer;

public class Defender extends Footballer {

    private static final int GOALS_RANK = 7;
    private static final int ASSISTS_RANK = 4;
    private static final int CLEAN_SHEETS_RANK = 3;

    public Defender() {}

    public Defender(int number, String name) {
        super(number, name);
    }

    @Override
    public int getPoints() {
        return getGoals() * GOALS_RANK +
                getAssists() * ASSISTS_RANK +
                getCleanSheets() * CLEAN_SHEETS_RANK;
    }
}
