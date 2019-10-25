package pl.sda.zadania_03_10;

public abstract class Shape {
    private String color;
    public abstract double getArea();
    public abstract double getParameter();
    @Override
    public String toString() {
        return "Pole = " + getArea() + ", Obwód = " + getParameter();
    }

}
