package ge.edu.btu.fantasy.event;

public interface IEvent {

    void addGoal(boolean homeTeamGoal, int goalNumber, int assistNumber);

    void finish();
}
