package pl.sda.zadania_05_25.strategy;

public class PkoBpStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Zapłacono przez PKO BP");
    }
}
