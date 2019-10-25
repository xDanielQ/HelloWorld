package pl.sda.zadania_05_25.Decorator.zadanie;


public class CarMain {
    public static void main(String[] args) {
        CarEquip carEquip = new LuxuryCar(new Car()) {
        };
        carEquip.print();

    }
}
