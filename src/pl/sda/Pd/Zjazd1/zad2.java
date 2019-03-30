package pl.sda.Pd.Zjazd1;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        int a;
        Scanner liczba = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        a = liczba.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " jest parzysta.");
        } else
            System.out.println(a + " nie jest parzysta.");
    }
}
