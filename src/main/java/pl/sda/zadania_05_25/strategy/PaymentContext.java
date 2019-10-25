package pl.sda.zadania_05_25.strategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        System.out.println("Przygotowanie do płatności");
        paymentStrategy.pay();
        System.out.println("Płatność zrealizowana");
    }
}
