package pl.sda.zadania_03_09;

public class Bicycle extends Vehicle{
    int liczbaSiedzen;
    public Bicycle(int speed, int maxSpeed, int liczbaSiedzen) {
        super(speed, maxSpeed);
        this.liczbaSiedzen = liczbaSiedzen;
    }
}
