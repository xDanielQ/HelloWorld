package pl.sda.zadania_05_25.prototype;

import java.util.HashMap;

public class ShapePrototypeProvider {

    private final HashMap<String, Shape2D> prototypeShapeMap;

    public ShapePrototypeProvider(HashMap<String, Shape2D> prototypeShapeMap) {
        this.prototypeShapeMap = prototypeShapeMap;
    }

    public Shape2D create(String shapeType) {
        if (prototypeShapeMap.containsKey(shapeType)) {
            return prototypeShapeMap.get(shapeType).create();
        } else {
            return null;
        }
    }
}
