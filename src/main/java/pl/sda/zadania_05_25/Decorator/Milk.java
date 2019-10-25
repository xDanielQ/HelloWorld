package pl.sda.zadania_05_25.Decorator;

public class Milk extends BaseCoffeeIngredient {

    protected Milk(CoffeeIngredient coffeeIngredient) {
        super(coffeeIngredient);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("mleko");
    }
}
