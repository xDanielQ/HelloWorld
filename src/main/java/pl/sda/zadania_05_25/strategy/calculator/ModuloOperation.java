package pl.sda.zadania_05_25.strategy.calculator;

public class ModuloOperation implements MathOperation {
    @Override
    public void operation(double a, double b) {
        if(a !=0 && b !=0) {
            System.out.print("modulo (reszta z dzielenia jest: " + (a % b));
        }else{

            System.out.print("modulo (reszta z dzielenia jest: " + 0);
        }
    }
}
