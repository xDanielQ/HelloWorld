package pl.sda.zadania_05_25.strategy.calculator;

public class SubstractOperation implements MathOperation{
    @Override
    public void operation(double a, double b) {
        System.out.print("odejmowanie jest: " + (a - b));
    }
}
