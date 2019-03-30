package pl.sda.Pd.Zjazd2;

import java.util.Scanner;

public class Zad2Scanner {
    public static void main(String[] args) {
        System.out.println("Podaj długość boku a : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj długość boku b : ");
        int b = scanner.nextInt();
        System.out.println("Wielkość pola dla prostokąta o boku a=" + a +" i b=" + b + " wynosi: " + a * b );


    }
}
