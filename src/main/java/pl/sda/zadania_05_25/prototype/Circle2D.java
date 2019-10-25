package pl.sda.zadania_05_25.prototype;

public class Circle2D implements Shape2D {

    @Override
    public void printShape() {
        System.out.println("okrąg");
    }

    @Override
    public Shape2D create() {
        return new Circle2D();
    }
}
