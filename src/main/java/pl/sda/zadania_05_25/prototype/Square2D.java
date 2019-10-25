package pl.sda.zadania_05_25.prototype;

public class Square2D implements Shape2D {
    @Override
    public void printShape() {
        System.out.println("kwadrat");
    }

    @Override
    public Shape2D create() {
        return new Square2D();
    }
}
