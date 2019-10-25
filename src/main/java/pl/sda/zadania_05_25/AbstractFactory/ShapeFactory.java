package pl.sda.zadania_05_25.AbstractFactory;

public class ShapeFactory {

    public Shape2D create2D(String shapeType) {
        if (shapeType.equals("kwadrat")) {
            return new Square2D();
        } else if (shapeType.equals("okrąg")) {
            return new Circle2D();
        } else {
            return null;
        }
    }

    public Shape3D create3D(String shapeType) {
        if (shapeType.equals("sześcian")) {
            return new Cube3D();
        } else if (shapeType.equals("kula")) {
            return new Sphere3D();
        } else {
            return null;
        }
    }
}
