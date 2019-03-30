package pl.sda.zadania_03_10;

public class Circle extends Shape {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getParameter() {
        return 2 * Math.PI * r;
    }

    public double diameter() {
        return 2 * r;
    }
}
