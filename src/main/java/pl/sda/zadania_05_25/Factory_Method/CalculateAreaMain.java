package pl.sda.zadania_05_25.Factory_Method;

public class CalculateAreaMain {
    public static void main(String[] args) {
        FiguresFactory figure = new FiguresFactory();
        Shape circle = figure.create("Koło");
        Shape square = figure.create("Kwadrat");
        Shape triangle = figure.create("Trójkąt");

        System.out.println(circle.calculateArea());

        System.out.println(square.calculateArea());
        System.out.println(triangle.calculateArea());


    }
}
