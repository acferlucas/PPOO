package observer.weather;

public class PressureConditionDisplay implements Observer, DisplayElement{

    private float pressure;
    private Subject weatherData;

    public PressureConditionDisplay(Subject subject) {
        this.weatherData = subject;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("pressure conditions: " + this.pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
