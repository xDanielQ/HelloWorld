package pl.sda.zadania_02_24;

public class InstrukcjaIf {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int e = 9;
        int f = 0;

        if (a > 3) {
            System.out.println("1. Ok");
        } else {
            System.out.println("1. Warunek niespełniony");
        }
        if (c < d) {
            System.out.println("2. Ok");
        }else {
            System.out.println("Warunek niespełniony");
        }
        if ((a - a) == f){
            System.out.println("3. Ok");
        }else {
            System.out.println("Warunek niespełniony");
        }
        if (true) {
            System.out.println("4. Ok");
        }else {
            System.out.println("Warunek niespełniony");
        }
        if (e % a == f ) {
            System.out.println("5. Ok");
        }else {
            System.out.println("5. Warunek niespełniony");
        }
        if (e % b == f) {
            System.out.println("6. Ok");
        }else {
            System.out.println("Warunek niespełniony");
        }


    }
}
