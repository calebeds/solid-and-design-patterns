package behavioraldesignpatterns.observerpattern.stockexchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject {
    private float price = 100;
    private Random random;
    private List<Observer> observers;

    public StockExchange() {
        this.random = new Random();
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o: observers) {
            o.update(price);
        }
    }

    public void start() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            price = price + 2 * random.nextFloat() - 1;
            notifyAllObservers();
            System.out.println(price);
        }
    }


}
