package pl.sda.zadania_03_31;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorytmFigury3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość figury od 1 do 20");
        int a = scanner.nextInt();
        if (a > 0 && a < 20 ) {
            int width = a;
            int height = a;
            char[] canvas = new char[width * height];
            Arrays.fill(canvas, ' ');

            for (int i = 0; i < 10; ++i) {
                canvas[0 * height + i] = '*';
                canvas[9 * height + i] = '*';
                canvas[i * height] = '*';
                canvas[i * height + 9] = '*';
            }

            for (int y = 0; y < height; ++y) {
                for (int x = 0; x < width; ++x)
                    System.out.print(canvas[y * width + x]);
                System.out.println();
            }
        }else {
            System.out.println("Podaj Prawidłową liczbę!!!");
        }
    }
}
