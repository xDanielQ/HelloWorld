package pl.sda.zadania_05_25.Decorator.zadanie;

public abstract class CarBase implements CarEquip{

    private final CarEquip carEquip;

    protected CarBase(CarEquip carEquip) {
        this.carEquip = carEquip;
    }

    @Override
    public void print() {
        carEquip.print();

    }
}
