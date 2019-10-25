package pl.sda.zadania_05_25.Decorator;

public abstract class BaseCoffeeIngredient implements CoffeeIngredient {

    private final CoffeeIngredient coffeeIngredient;

    protected BaseCoffeeIngredient(CoffeeIngredient coffeeIngredient) {
        this.coffeeIngredient = coffeeIngredient;
    }

    @Override
    public void print() {
        coffeeIngredient.print();
    }
}
