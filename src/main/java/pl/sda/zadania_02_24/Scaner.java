package pl.sda.zadania_02_24;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        String imie;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        imie = odczyt.nextLine();
        System.out.println("Witaj " + imie);

        System.out.println("Ile masz lat?");
        int wiek;
        wiek = odczyt.nextInt();


        System.out.println("Serio?! Wyglądasz młodo jak na swój wiek");

        System.out.println("O której kończysz pracę " + imie + "?");
        double endWork;
        endWork = odczyt.nextDouble();

        System.out.println("Ale masz fajnie. Też bym chciał skończyć o " + endWork + ", ale niestety jestem tylko komputerem. :(");
    }
}
