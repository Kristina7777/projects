public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza(){
        name = "Чикаго вегетарианская пицца";
        dough = "Толстая основа ";
        sauce = "Соус вегенский острый";

        toppings.add("Кладем много сыра моцарелла");
        toppings.add("Кладем много овощей");
    }
    void cut(){
        System.out.println("Пицца нарезается квадратами");
    }

}
