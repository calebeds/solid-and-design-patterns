package behavioraldesignpatterns.observerpattern;

public class WeatherObserver implements Observer {

    private int pressure;
    private int temperature;
    private int humidity;
    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void updated(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.printf("Pressure: %d | Temperature: %d | Humidity: %d%n",
                this.pressure, this.temperature, this.humidity);
    }
}
