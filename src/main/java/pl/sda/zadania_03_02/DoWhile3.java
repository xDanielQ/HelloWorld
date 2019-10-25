package pl.sda.zadania_03_02;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        int n;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            n = scanner.nextInt();
            for (int i = 1; i <= n; i++) ;
            double x = Math.sqrt(n);
            System.out.println(x);
        } while (n > 0);
    }
}
