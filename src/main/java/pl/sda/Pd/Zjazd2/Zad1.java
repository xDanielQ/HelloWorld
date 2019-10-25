package pl.sda.Pd.Zjazd2;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        System.out.println("Wynikiem mnożenia jest " + multiply());
    }
    static int multiply() {
        System.out.println("Podaj liczbę:");
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        System.out.println("Podaj liczbę:");
        final int b = scanner.nextInt();
        return a * b;


    }
}
