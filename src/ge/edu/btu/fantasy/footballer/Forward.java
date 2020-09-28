package ge.edu.btu.fantasy.footballer;

public class Forward extends Footballer {

    private static final int GOALS_RANK = 4;
    private static final int ASSISTS_RANK = 3;

    public Forward() {}

    public Forward(int number, String name) {
        super(number, name);
    }

    @Override
    public int getPoints() {
        return getGoals() * GOALS_RANK +
                getAssists() * ASSISTS_RANK;
    }
}
