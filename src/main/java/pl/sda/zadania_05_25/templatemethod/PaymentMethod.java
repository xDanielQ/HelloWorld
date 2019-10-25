package pl.sda.zadania_05_25.templatemethod;

public abstract class PaymentMethod {

    public void pay() {
        System.out.println("Przygotowanie do płatności");
        payMethod();
        System.out.println("Płatność zrealizowana");
    }

    protected abstract void payMethod();
}
