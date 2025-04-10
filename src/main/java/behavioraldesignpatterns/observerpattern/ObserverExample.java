package behavioraldesignpatterns.observerpattern;

public class ObserverExample {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);

        station.setHumidity(100);
        station.setPressure(220);
        station.setTemperature(300);

    }
}
