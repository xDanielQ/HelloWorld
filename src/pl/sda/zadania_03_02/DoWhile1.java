package pl.sda.zadania_03_02;

import java.util.Scanner;

public class DoWhile1 {

    public static void main(String[] args) {
        int n;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("podaj liczbę większą od 0");

            } else {
                int i = n;
                do {
                    System.out.println("Hello World");
                    i--;
                } while (i > 0);
            }
        } while (n > 0);
    }
}