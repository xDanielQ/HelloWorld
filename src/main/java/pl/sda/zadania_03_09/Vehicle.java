package pl.sda.zadania_03_09;

public class Vehicle {
    //zadanie do zrobienia z klasą SUPER analogicznie jak punk2D Punkt3d punkt test
    //klasa vehicle , klasa car, klasa bicycle, klasa testująca wszystkie klasy;
    //sprawdzić i zrobić

    int speed;
    int maxSpeed;

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
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

    public Vehicle(int speed, int maxSpeed){
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }
}
