package behavioraldesignpatterns.commandpattern.queuing;

public class Task {
    private final int id;

    public Task(int id) {
        this.id = id;
    }

    public void solveProblem() {
        System.out.println("Solving the problem with ID " + id);
    }
}
