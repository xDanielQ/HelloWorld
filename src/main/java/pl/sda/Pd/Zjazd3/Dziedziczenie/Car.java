package pl.sda.Pd.Zjazd3.Dziedziczenie;

public class Car extends Vehicle{

    int seats = 4;

    public Car(int speed, int maxSpeed, int wheelCount, int seats) {
        super(speed, maxSpeed, wheelCount);
        this.wheelCount = 4;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                "max speed=" + maxSpeed +
                "seats=" + seats +
                "wheel count=" + wheelCount +
                '}';
    }
}
