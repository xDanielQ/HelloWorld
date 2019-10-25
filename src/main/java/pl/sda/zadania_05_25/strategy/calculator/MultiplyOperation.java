package pl.sda.zadania_05_25.strategy.calculator;

public class MultiplyOperation implements MathOperation{
    @Override
    public void operation(double a, double b) {
        if(a !=0 && b !=0) {
            System.out.print("mnożenie jest: " + (a * b));
        }else{

            System.out.print("mnożenie jest: " + 0);
        }
    }
}
