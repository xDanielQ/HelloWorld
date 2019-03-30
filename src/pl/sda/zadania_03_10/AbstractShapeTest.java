package pl.sda.zadania_03_10;

public class AbstractShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(14,5);
        Circle circle = new Circle(12);


        System.out.println("Prostokąt: " + rectangle.toString());
        System.out.println("Koło: " + circle.toString());
    }
}
