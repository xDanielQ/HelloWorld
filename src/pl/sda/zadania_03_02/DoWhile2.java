package pl.sda.zadania_03_02;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        int n;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            n = scanner.nextInt();
              for(int i = 1; i <= n; i++);
            System.out.println("Hello world");
        }while (n > 0);



    }
}
