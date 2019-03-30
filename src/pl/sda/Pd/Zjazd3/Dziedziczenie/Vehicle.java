package pl.sda.Pd.Zjazd3.Dziedziczenie;

public class Vehicle {
    public int speed;
    public int maxSpeed;
    public int wheelCount;


    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }


    public Vehicle(int speed, int maxSpeed, int wheelCount) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
