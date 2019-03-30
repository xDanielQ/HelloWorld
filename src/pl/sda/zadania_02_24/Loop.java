package pl.sda.zadania_02_24;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner odczyt1 = new Scanner(System.in);

        System.out.println("Za ile sekund wybuchnie bomba?");
        int liczba1;
        liczba1 = odczyt1.nextInt();

        for (int i =liczba1; i >= 0; i--) {
            if (i != 0){
                System.out.println("Bomba wybuchnie za " + i);
            }else {
                System.out.println("BOOM!!!");
            }
        }

    }
}
