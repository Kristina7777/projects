//объекты должны быть взаимозаменяемы, поэтому расширяем класс Beverage
public abstract class CondimentDecorator extends Beverage {
    // Заново реализовываем метод getDescription()
    public abstract String getDescription();
}
