public class PizzaTestDrive {
    public static void main(String[] args) {
        // создаем 2 объекта пицца
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        // используем один объект для выполнения заказа Итана
        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Название пиццы: " + pizza.getName());
        System.out.println("Основа пиццы: " + pizza.getDough());
        System.out.println("Соус: " + pizza.getDough()  );
        System.out.println("Добавки: " + pizza.getToppings() + "\n");
        //используем другой объект для выполнения заказа Джоэла
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Название пиццы: " + pizza.getName() );
        System.out.println("Основа пиццы: " + pizza.getDough() );
        System.out.println("Соус: " + pizza.getSauce() );
        System.out.println("Добавки: " + pizza.getToppings() );
    }
}
