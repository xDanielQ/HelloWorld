package pl.sda.zadania_03_31;


import java.util.Scanner;

public class Zad1pkt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int suma = 0;
        double srednia;
        int i = 0;
        for (; ; i++) {
            x = scanner.nextInt();
            suma += x;
            if (x == 0)
                break;

        }
        srednia = suma / i;
        System.out.println("Suma wynosi: " + suma);
        System.out.println("srednia wynosi: " + srednia);
    }
}
