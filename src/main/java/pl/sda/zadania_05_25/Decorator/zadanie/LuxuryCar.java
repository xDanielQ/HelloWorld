package pl.sda.zadania_05_25.Decorator.zadanie;

public class LuxuryCar extends CarBase {
    protected LuxuryCar(CarEquip carEquip){
        super (carEquip);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Wybrano wersję Luksusową!");
    }
}
