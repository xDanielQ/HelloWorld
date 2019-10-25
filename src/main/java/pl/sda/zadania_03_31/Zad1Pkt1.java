package pl.sda.zadania_03_31;

import java.util.Scanner;

public class Zad1Pkt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int silnia = 1;
        for(int i = 1; i <= x; i++) {
            silnia = i * silnia;
            System.out.println("Silnia od x = " + silnia);
        }
    }
}
