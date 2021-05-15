import java.util.ArrayList;
// в классе WeatherData реализуем интерфейс Subject
public class WeatherData implements Subject {
    private ArrayList observers; // добавляем контейнер ArrayList для хранения наблюдателей
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList(); // создаем ArrayList() в конструкторе
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o); // новые наблюдатели просто добавляются в конец списка

    }
// если наблюдатель хочет отменить регистрацию, то удаляем его из списка
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);// c помощью indexOf() ищем необходимый индекс в списке, который нужно удалить.
        if (i >=0) {  // если не встречается такого индекса, то присваивается значение -1, поэтому удаляться будет строка с индексом от >=0
            observers.remove(i);
        }

    }
// оповещение наблюдателей об изменении состояния через метод update, реализуемый всеми наблюдателями
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }

    }
    // оповещение наблюдателей о появлении новых данных
    public void measurementsChanged(){
        notifyObservers();
    }
    // тестовый метод чтения данных с устройства
    public void setMeasurments(float temperature, float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    // другие методы WeatherData
}
