public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item){
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")){
            return new NyStyleVeggiePizza();
        } else if (item.equals("clam")){
            return new NYStyleClamPizza();
        } else if (item.equals("pepperony")){
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
