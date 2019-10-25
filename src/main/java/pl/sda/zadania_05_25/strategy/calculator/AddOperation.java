package pl.sda.zadania_05_25.strategy.calculator;

public class AddOperation implements MathOperation{

    @Override
    public void operation(double a, double b) {
        System.out.print("dodawanie jest: " + (a + b));
    }
}
