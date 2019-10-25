package pl.sda.zadania_05_25.Factory_Method;

public class FiguresFactory {

    public Shape create(String shapeType) {
        if(shapeType.equals("Kwadrat")){
            return new Square();
        } else if(shapeType.equals("Trójkąt")){
            return  new Triangle();
        }else if(shapeType.equals("Koło")){
            return new Circle();
        }else {
            return null;
        }

    }
}
