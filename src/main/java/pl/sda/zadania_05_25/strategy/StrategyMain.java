package pl.sda.zadania_05_25.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new BlikStrategy());
        paymentContext.pay();
        System.out.println("-----------");
        paymentContext.setPaymentStrategy(new PkoBpStrategy());
        paymentContext.pay();
    }
}
