package pl.sda.zadania_05_25.strategy.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        OperationContext operationContext = new OperationContext();
        operationContext.setMathOperation(new AddOperation());
        operationContext.operation(10, 5);
        System.out.println("/n");
        OperationContext operationContext2 = new OperationContext();
        operationContext2.setMathOperation(new SubstractOperation());
        operationContext2.operation(10, 5);
        System.out.println("/n");
        OperationContext operationContext3 = new OperationContext();
        operationContext3.setMathOperation(new MultiplyOperation());
        operationContext3.operation(10, 5);
        System.out.println("/n");
        OperationContext operationContext4 = new OperationContext();
        operationContext4.setMathOperation(new DivideOperation());
        operationContext4.operation(10, 5);
        System.out.println("/n");
        OperationContext operationContext5 = new OperationContext();
        operationContext5.setMathOperation(new ModuloOperation());
        operationContext5.operation(10, 5);
        System.out.println("/n");
    }
}

