package pl.sda.zadania_03_10;

public class TestPolimorfizm {
    public static void main(String[] args) {
        //tworzenie obiektów odnoszących się do klasy shape z której wyciągamy metody circle i rectangle
        Shape circle = new Circle(23);
        Shape rectangle = new Rectangle(2, 3);


        //możemy sie odwołać do parametrów metody za pomocą kropki
        circle.getArea();
        ((Circle) circle).diameter();


        rectangle.getArea();

        Shape[] shapes = new Shape[]{
                new Circle(23),
                new Rectangle(1, 2),
                new Circle(25),
                new Rectangle(1, 3),

        };
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Pole powierzchni = " + shapes[i].getArea() + " dla obiektu klasy " + shapes[i].getClass());
        }
    }

}
