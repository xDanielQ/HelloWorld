package pl.sda.zadania_02_24;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj liczba: ");
        int n = scanner.nextInt();
        System.out.println("Podaj liczbę: ");
        int m = scanner.nextInt();

//        for (int i = liczba ; i >= 0; i--) {
//            if (i % dzielnik == 0 && i != 0)
//                System.out.println(i);
//        }
        int x = 1;
        for (int i = 0; i < m; i++) {
            x =  x * n;
                System.out.println("Potegą wychodzi" +  x );
        }

    }
}