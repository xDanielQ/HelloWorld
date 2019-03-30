package pl.sda.zadania_02_24;

import java.util.Scanner;

public class ScanerLiczby {
    public static void main(String[] args) {
        double liczba1;
        double liczba2;
        Scanner odczyt1 = new Scanner(System.in);
        Scanner odczyt2 = new Scanner(System.in);


        System.out.println("Podaj piewszą liczbę: ");
        liczba1 = odczyt1.nextDouble();

        if (liczba1 != 0) {
            System.out.println("Podaj drugą liczbę: ");
        } else {
            System.out.println("Podaj liczbę różną od zera:");
            liczba1 = odczyt1.nextDouble();
        }


        liczba2 = odczyt2.nextDouble();
        double suma = liczba1 + liczba2;
        double odejmowanie = liczba1 - liczba2;
        double mnozenie = liczba1 * liczba2;
        double dzielenie = liczba1 / liczba2;

        if (liczba2 != 0) {
            System.out.println("Wynikiem dodawania liczby " + liczba1 + " oraz liczby " + liczba2 + " jest " + suma);
            System.out.println("Wynikiem odejmowania liczby " + liczba1 + " oraz liczby " + liczba2 + " jest " + odejmowanie);
            System.out.println("Wynikiem mnożenia liczby " + liczba1 + " oraz liczby " + liczba2 + " jest " + mnozenie);
            System.out.println("Wynikiem dzielenia liczby " + liczba1 + " oraz liczby " + liczba2 + " jest " + dzielenie);
        } else {
            System.out.println("Podaj liczbę różną od zera");
            liczba2 = odczyt2.nextDouble();
        }


    }
}
