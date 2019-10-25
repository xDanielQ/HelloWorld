package pl.sda.zadania_03_02;

import java.util.Scanner;

public class ExceptionThrowExample { //     TRY CATCH EXAMPLE
    public static void main(String[] args) {

        System.out.println("Prosze podać liczbę: ");
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        System.out.println("Prosze podać liczbę: ");
        final int b = scanner.nextInt();


        System.out.println(divide(a, b));

    }

    static Integer divide(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException ex) {
            System.out.println("Dzielenie przez zero!");
            return null;
        }


    }

}
