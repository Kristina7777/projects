// этот интерфейс реализуется всеми наблюдателями, т. о., все наблюдатели должны реализовать метод update
public interface Observer {
    // данные состояния, передаваемые наблюдателями при изменении состояния субъекта
    public void update(float temp, float humidity, float pressure);
}
