package pl.sda.zadania_03_02;

import java.util.Scanner;

public class TabliceZadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        if (n > 0) {
            int[] tab = new int[n];

            for (int i = 0; i < n; i++) {
                tab[i] = i + 1;


            }
            int i = 0;
            while (i < n ){
                System.out.println("Tab[" + i + "]=" + tab[i]);
                i++;
            }
        }
    }
}
