package pl.sda.zadania_05_25.Decorator;

public class Coffee implements CoffeeIngredient {
    @Override
    public void print() {
        System.out.println("kawa!");
    }
}
