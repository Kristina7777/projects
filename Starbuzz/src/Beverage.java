public abstract class Beverage {
    String description;

    // метод getDescription() уже реализован в классе Beverage
    public String getDescription() {
        return description;

    }
    // метод cost() необходимо реализовывать в субклассах
    public abstract double cost();


}
