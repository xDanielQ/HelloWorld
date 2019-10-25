package pl.sda.zadania_03_31;

import java.util.Scanner;

public class RekurencjaExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
//        int x = scanner.nextInt();
        int a = scanner.nextInt();
//
//        int wynik = 0;
//
//
//        while (x != 0){
//            wynik += x;
//            x--;
//        }
//        System.out.println("Liczba trójkątna wynosi: " + wynik);
        System.out.println(liczbaT(a));
    }

    static int liczbaT(int a){
        return a !=0?  a *liczbaT(a - 1):1;
    }
}
