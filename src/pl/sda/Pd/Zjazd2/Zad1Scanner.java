package pl.sda.Pd.Zjazd2;

import java.util.Scanner;

public class Zad1Scanner {


    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 0; i < a; i++ ) {
            System.out.println(i);
        }

    }
}
