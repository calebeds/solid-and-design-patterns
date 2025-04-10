package behavioraldesignpatterns.commandpattern.queuing;

public class QueuingExample {
    public static void main(String[] args) {
        final Algorithm algorithm = new Algorithm();

        Thread t1 = new Thread(() -> {
           algorithm.produce();
        });

        Thread t2 = new Thread(() -> {
            algorithm.consume();
        });

        t1.start();
        t2.start();
    }
}
