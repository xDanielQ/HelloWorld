package pl.sda.zadania_03_02;

import java.util.Scanner;

public class ExceptionsExample {
    public static void main(String[] args) {
        int[] tab = new int[]{1,2,3,4,5,6};

        System.out.println("Prosze podać liczbę: ");
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        try {
            System.out.println("tab[" + n + "]=" + tab[n]);

        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wprowadzono indeks z poza zakresu");
        }
    }
}
