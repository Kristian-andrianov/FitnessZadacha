public class StandingComm implements Command {
    private Exercises exercises;

    public StandingComm(Exercises exercises) {
        this.exercises = exercises;
    }

    @Override
    public void execute() {
        this.exercises.Standing();
    }
}
