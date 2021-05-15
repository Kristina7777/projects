public class Mocha extends CondimentDecorator {
    // Чтобы в объекте Mocha хранилась ссылка на Beverage понадобится переменная для хранения ссылки
    Beverage beverage;

    // способ присваивания ссылки на объект - передаем ссылку при вызове конструктора
    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    // В названии должны содержаться не только название напитка, но и дополнения к нему,
    // т.о. сначала получаем описание, делегируя вызов декорируемому объекту, а затем присоединяем строку Mocha
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    // вызов делегируется декорируемому объекту, затем стоимость шоколада прибавляется к результату
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
