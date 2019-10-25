package pl.sda.Pd.Zjazd2;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        System.out.println("Wynikiem potęgowania jest " + power());
    }
    static int power() {
        System.out.println("Podaj liczbę:");
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        System.out.println("Podaj liczbę:");
        final int b = scanner.nextInt();
        int wynik = a;
        for (int i = 1; i < b; i++) {

            wynik = a * wynik;


        }return wynik;

    }
}
