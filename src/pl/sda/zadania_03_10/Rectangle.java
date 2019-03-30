package pl.sda.zadania_03_10;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.a * this.b;
    }

    @Override
    public double getParameter() {
        return 2 * this.a + 2 * this.b;
    }


}
