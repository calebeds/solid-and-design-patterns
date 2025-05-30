package behavioraldesignpatterns.commandpattern.queuing;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {

    private BlockingQueue<Command> commands;

    public Algorithm() {
        this.commands = new ArrayBlockingQueue<>(10);
    }

    public void produce() {
        try {
            for(int i = 0; i < 10; i++) {
                commands.put(new TaskSolver(new Task(i)));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void consume() {
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                commands.take().execute();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
