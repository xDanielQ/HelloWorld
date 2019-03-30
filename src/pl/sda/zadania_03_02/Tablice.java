package pl.sda.zadania_03_02;

import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int n = scanner2.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String[] names = new String[n];
        String name = scanner.nextLine();

        while (n > 0) {
            System.out.println("Podales imie" + name);
            n--;
        }
    }

}

