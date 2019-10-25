package pl.sda.zadania_05_25.templatemethod;

public class PkoBpMethod extends PaymentMethod {
    @Override
    protected void payMethod() {
        System.out.println("Zapłacono przez PKO BP");
    }
}
