public class StarbuzzCoffee {
    public static void main (String args[]){
        // Заказываем эспрессо без дополнений, выводим описание и стоимость
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoast(); // создаем объект DarkRoast
        beverage2 = new Mocha(beverage2); // объект DarkRoast заворачиваем в объект Mocha
        beverage2 = new Mocha(beverage2); // объект DarkRoast заворачиваем в объект Mocha
        beverage2 = new Whip(beverage2); // объект DarkRoast заворачиваем в объект Whip
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());



    }
}
