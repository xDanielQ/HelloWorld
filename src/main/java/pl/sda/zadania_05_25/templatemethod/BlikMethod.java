package pl.sda.zadania_05_25.templatemethod;

public class BlikMethod extends PaymentMethod {
    @Override
    protected void payMethod() {
        System.out.println("Zapłacono BLIK-iem");
    }
}
