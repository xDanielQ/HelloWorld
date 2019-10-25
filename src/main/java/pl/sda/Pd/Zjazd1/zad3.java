package pl.sda.Pd.Zjazd1;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        int a;
        Scanner liczba = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        a = liczba.nextInt();

        if (a > 0) {
            System.out.println(a + " jest większa od zera.");
        } else if (a < 0) {
            System.out.println(a + " jest mniejsza od zera");
        }else {
            System.out.println("Twoja liczba to zero!");
        }
    }
}
