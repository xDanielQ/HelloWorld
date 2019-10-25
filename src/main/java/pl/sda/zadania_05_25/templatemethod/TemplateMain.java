package pl.sda.zadania_05_25.templatemethod;

public class TemplateMain {

    public static void main(String[] args) {
        PaymentMethod method = new BlikMethod();
        method.pay();
        PaymentMethod method1 = new PkoBpMethod();
        method1.pay();
    }
}
