public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Чикаго пицца";
        dough = "Толстая основа ";
        sauce = "Соус томато";

        toppings.add("Кладем много сыра моцарелла");
        toppings.add("Двойная порция чеснока");
        toppings.add("Двойная порция соуса и специй");
        toppings.add("Дополнительный лук");
    }
    void cut(){
        System.out.println("Пицца нарезается квадратами");
    }
}
