package observerpattern;

public interface Observer {
    void updated(int pressure, int temperature, int humidity);
}
