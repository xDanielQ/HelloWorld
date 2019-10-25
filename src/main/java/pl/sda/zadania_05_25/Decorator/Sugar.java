package pl.sda.zadania_05_25.Decorator;

public class Sugar extends BaseCoffeeIngredient {
    protected Sugar(CoffeeIngredient coffeeIngredient) {
        super(coffeeIngredient);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("cukier");
    }
}
