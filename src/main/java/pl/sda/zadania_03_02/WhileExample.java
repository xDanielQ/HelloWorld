package pl.sda.zadania_03_02;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        final int n = scanner.nextInt();

        int i = n;
        while (i >= 0) {
            System.out.println("Bomba wybuchnie za " + i);
            i--;
        }
        System.out.println("BOOM!!!");
    }
}
