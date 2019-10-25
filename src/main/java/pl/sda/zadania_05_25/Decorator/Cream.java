package pl.sda.zadania_05_25.Decorator;

public class Cream extends BaseCoffeeIngredient {
    protected Cream(CoffeeIngredient coffeeIngredient) {
        super(coffeeIngredient);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("śmietanka");
    }
}
