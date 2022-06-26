public class LayingComm implements Command {

    private Exercises exercises;

    public LayingComm(Exercises exercises) {
        this.exercises = exercises;
    }

    @Override
    public void execute() {
        this.exercises.Laying();
    }
}
