package pl.sda.zadania_05_25.Decorator.zadanie;

public class SportsCar extends CarBase {
    protected SportsCar(CarEquip carEquip){
        super (carEquip);
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Wybrano wersję Sport!");
    }
}
