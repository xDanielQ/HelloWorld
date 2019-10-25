package pl.sda.Pd.Zjazd3.Dziedziczenie;

public class Bicycle extends Vehicle{
    int wheelsSize = 25;

    public Bicycle(int speed, int maxSpeed, int wheelCount, int wheelsSize) {
        super(speed, maxSpeed, wheelCount);
       wheelCount = 2;
        this.wheelsSize = wheelsSize;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                "max speed=" + maxSpeed +
                "wheelsSize=" + wheelsSize +
                "wheel count=" + wheelCount +
                '}';
    }
}
