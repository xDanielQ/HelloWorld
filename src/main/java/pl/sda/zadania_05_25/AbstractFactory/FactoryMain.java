package pl.sda.zadania_05_25.AbstractFactory;

public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape2D square = factory.create2D("kwadrat");
        Shape2D circle = factory.create2D("okrąg");

        Shape3D cube = factory.create3D("sześcian");
        Shape3D sphere = factory.create3D("kula");

        square.printShape();
        circle.printShape();

        cube.printShape();
        sphere.printShape();
    }
}
