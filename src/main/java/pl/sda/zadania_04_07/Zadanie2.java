package pl.sda.zadania_04_07;


import java.util.Random;
import java.util.Scanner;



//LOSOWANIE X LICZB (X PODANY PRZEZ UZYTKOWNIKA) Z PRZEDZIALY ZADEKLAROWANEGO PRZEZ UZYTKOWNIKA
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb potrzebujesz:");
        int x = scanner.nextInt();
        System.out.println("Podaj minimalna wartosc:");
        int start = scanner.nextInt();
        System.out.println("Podaj maksymalna wartosc:");
        int koniec = scanner.nextInt();

        int[] tab = new int[x];
        Random random = new Random();


        for(int i = 0; i < x; i++) {
            tab[i] = random.nextInt(koniec - start + 1) + start;
            System.out.println((i+1) + " : " + tab[i]);
        }

    }

}
