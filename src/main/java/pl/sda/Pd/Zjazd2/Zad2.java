package pl.sda.Pd.Zjazd2;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        System.out.println("Wynikiem mnożenia jest " + multiply());
    }
    static int multiply() {
        System.out.println("Podaj liczbę:");
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        System.out.println("Podaj liczbę:");
        final int b = scanner.nextInt();
        int wynik = 0;
        for (int i = 1; i <= b; i++) {

            wynik = a + wynik;


        }return wynik;

    }
}
