public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    // конструктору передается объект weatherData, который используется для регистрации элемента в качестве наблюдателя
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    // при вызове метода update сохраняем значение температуры и влажности, после чего вызываем метод display()
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    // этот метод выводит текущие значения температуры и влажности
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degress and " + humidity + "% humidity " + pressure);
    }
}
