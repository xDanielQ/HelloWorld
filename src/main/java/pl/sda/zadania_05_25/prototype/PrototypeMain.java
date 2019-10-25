package pl.sda.zadania_05_25.prototype;

import java.util.HashMap;

public class PrototypeMain {

    public static void main(String[] args) {
        HashMap<String, Shape2D> prototypes = new HashMap<String, Shape2D>() {{
            put("Kwadrat", new Square2D());
            put("Okrąg", new Circle2D());
        }};

        ShapePrototypeProvider prototypeProvider = new ShapePrototypeProvider(prototypes);
        Shape2D square = prototypeProvider.create("Kwadrat");
        Shape2D circle = prototypeProvider.create("Okrąg");

        square.printShape();
        circle.printShape();
    }
}
