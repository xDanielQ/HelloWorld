package pl.sda.zadania_04_07;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long[] tab = new long[x+1];

        for (int i = 0; i <= x; i++) {
            tab[i] = fib(i);
            System.out.println(tab[i]);
        }
    }


    public static int fib(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        else if (n == 0)
            return 0;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
