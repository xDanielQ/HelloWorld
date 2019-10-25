package pl.sda.zadania_05_25.strategy.calculator;

public class OperationContext {
    private MathOperation mathOperation;

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }


    public void operation(double a, double b) {
        System.out.print("Wynikiem działania ");
        mathOperation.operation(a,b);
    }
}
