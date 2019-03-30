package pl.sda.zadania_03_16;

import java.util.Scanner;

public class KlasaStringTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String tab[] = new String[5];

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Podaj tablice wyrazow:");
            tab[i] = scanner.nextLine();
        }

        boolean found = KlasaString.sprawdzTablice(tab);

        if (found) {
            System.out.println("Znaleziono wyraz rozpoczynający się od abc");
        } else {
            System.out.println("Nie znaleziono wyrazu!");
        }
        System.out.println("cde występuje " + countSubstring(tab) + " razy");
    }

    private static int countSubstring(String[] tab) {
        int x = 0;
        for (String s : tab) {
            if (s.endsWith("cde")) {
                x++;
            }

        }
        return x;
    }
}