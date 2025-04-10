package observerpattern.stockexchange;

public interface Subject {
    void addObserver(Observer o);
    void notifyAllObservers();
}
