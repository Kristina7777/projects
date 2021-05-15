import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    ArrayList toppings = new ArrayList();



    abstract void prepare(){
        System.out.println("Принимем заказ: " + name);
        System.out.println("Подготавливаем тесто: " + dough);
        System.out.println("Готовим соус: " + sauce);
        System.out.println("Готовим топпинги: " + toppings);
        System.out.println("Подбрасываем основание...");
        System.out.println("Добавляем соус...");
        // создаем цикл для перечисления топпингов для пиццы
        System.out.println("Добавляем топпинги: ");
        for (int i = 0; i < toppings.size(); i++){
            System.out.println("  " + toppings.get(i));
        }
    }
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box(){ System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList getToppings() {
        return toppings;
    }
    public String getName() {
        return name;
    }
   public String toString() {
   // код описания пиццы
   }

    }
