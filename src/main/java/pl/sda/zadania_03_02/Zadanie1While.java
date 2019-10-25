package pl.sda.zadania_03_02;

import java.util.Scanner;

public class Zadanie1While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        final int n = scanner.nextInt();

        int i = n;
        int x = 0;
        while (i >= 0) {
//            System.out.println("suma wynosi " + x);
            x = x + i;
            i--;
            if (i == 0) {
                System.out.println("Suma " + n + " kolejnych liczb wynosi " + x);
            }
        }
    }
}
