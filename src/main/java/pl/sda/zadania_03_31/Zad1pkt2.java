package pl.sda.zadania_03_31;

import java.util.Scanner;

public class Zad1pkt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int suma = 0;
        if (x != 0) {
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    suma += i;
                }

            }
            System.out.println(suma);
        }else {
            System.out.println("Wpisales zero!");
        }
    }
}
