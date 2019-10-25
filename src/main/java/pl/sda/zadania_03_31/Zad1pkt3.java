package pl.sda.zadania_03_31;

import java.util.Scanner;

public class Zad1pkt3 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę większą od 0:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int x = 2;
        int y = 3;
        int z = 5;
        if (a % x != 0 && a % y != 0 && a % z != 0) {
            System.out.println(a + " jest liczbą pierwszą");
//        } else if (a == 2 || a == 5 || a == 3) {
//            System.out.println(a + " jest liczbą pierwszą");
        } else {
            System.out.println(a + " nie jest liczbą pierwszą");
        }
    }
}
