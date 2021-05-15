
//все классы конкретных напитков расширяют Beverage
public class Espresso extends Beverage {
    //описание задается в конструкторе класса, переменная description наследуется от Beverage
    public Espresso() {
        description = "Espresso";
    }
    // возвращаем стоимость базового Эспрессо (1,99)
    public double cost(){
        return 1.99;
    }
}
