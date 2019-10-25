package pl.sda.zadania_03_31;

import java.util.Scanner;

public class CiagFibonacciego {
    public static int fib(int n){
        if ((n==1)||(n==2))
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Podaj liczbę do obliczenia ciagu Fibonacciego");
        n = scanner.nextInt();
        System.out.println(n+"-ty wyraz ciagu Fibonacciego: "+fib(n));
        return;
    }
}
