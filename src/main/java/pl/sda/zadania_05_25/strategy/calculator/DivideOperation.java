package pl.sda.zadania_05_25.strategy.calculator;

public class DivideOperation implements MathOperation {
    @Override
    public void operation(double a, double b) {
        if(a !=0 && b !=0) {
            System.out.print("dzielenie jest: " + (a / b));
        }else{

            System.out.print("dzielenia jest: " + 0);
        }
    }
}
