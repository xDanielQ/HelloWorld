package pl.sda.zadania_04_07;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy: ");
        int x = scanner.nextInt();
        System.out.println("Podaj wartośc tablicy: ");


        int[] tab = new int[x];
        for(int i = 0; i < tab.length; i++){
            int y = scanner.nextInt();
            tab[i] = y;

        }
        System.out.println("Twoja tablica wygląda następująco: ");
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + ", ");

        }
        System.out.println("");
        System.out.println("Po odwróceniu otrzymamy: ");

        int[] tab1 = reverse(tab);
        for(int i = 0; i < tab1.length; i++){
            System.out.print(tab1[i] + ", ");

        }


    }

    public static int[] reverse(int[] tab1) {
            int x = tab1.length- 1;

            for(int i =0; i < tab1.length/2; i++){
                int y = tab1[i];
                tab1[i]= tab1[x];
                tab1[x] = y;
                x--;
            }
            return tab1;
    }
}
