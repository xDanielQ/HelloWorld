package pl.sda.zadania_05_25.Decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        CoffeeIngredient coffee = new Milk(new Cream(new Coffee()));
        coffee.print();
        System.out.println("-----");
        CoffeeIngredient coffee1 = new Cream(new Milk(new Coffee()));
        coffee1.print();
        System.out.println("-----");
        CoffeeIngredient coffee2 = new Sugar(new Milk(new Coffee()));
        coffee2.print();
    }
}
