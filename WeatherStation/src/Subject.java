

public interface Subject {
    // оба метода получают в аргементе  Oserver (регистрируемый или исключаемый наблюдатель)
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // этот метод вызывается для оповещения наблюдателей об изменении состояния субъекта
    public void notifyObservers();
}
