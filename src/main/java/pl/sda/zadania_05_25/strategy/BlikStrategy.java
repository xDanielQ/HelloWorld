package pl.sda.zadania_05_25.strategy;

public class BlikStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Zapłacono BLIK-iem");
    }
}
