package pl.sda.zadania_03_02;

import java.util.Scanner;

public class Zadaniel2While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        final int n = scanner.nextInt();

        int i = n;
        long x = 1;
        while (i >= 1) {
            x *= i--;
//            x = x * i; górna operacja działa tak samo jak te dwie
//            i--;
            if (i == 0) {
                System.out.println("Silnia " + n + " wynosi " + x);
            }
        }
    }
}
