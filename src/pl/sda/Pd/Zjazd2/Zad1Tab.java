package pl.sda.Pd.Zjazd2;

import java.util.Scanner;

public class Zad1Tab {
    public static void main(String[] args) {
print();
    }

    static void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy: ");
        final int n = scanner.nextInt();

        if (n > 0) {
            int[] tab = new int[n];

            for (int i = 0; i < n; i++) {
                tab[i] = i;


            }
            int i = 0;
            while (i < n) {
                System.out.println("Tab[" + i + "]=" + tab[i]);
                i++;
            }
        }
    }

}
