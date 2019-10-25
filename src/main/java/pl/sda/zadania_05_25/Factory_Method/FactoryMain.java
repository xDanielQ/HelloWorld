package pl.sda.zadania_05_25.Factory_Method;

public class FactoryMain {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal cat = factory.create("Kot");
        Animal dog = factory.create("Pies");

        cat.printAnimalVoice();
        dog.printAnimalVoice();
    }
}
