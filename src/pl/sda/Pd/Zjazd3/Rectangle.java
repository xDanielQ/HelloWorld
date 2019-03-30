package pl.sda.Pd.Zjazd3;

public class Rectangle {

    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 6);
        System.out.println(rectangle.getArea());
    }

    public int getArea() {
        return this.a * this.b;

    }

}
