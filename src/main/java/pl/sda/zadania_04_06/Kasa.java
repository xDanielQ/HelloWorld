package pl.sda.zadania_04_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kasa {
    //Zaimplementuj algorytm który wyda jak najmniej banknotów po podaniu kwoty

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        double[] nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        System.out.println("Podaj kwotę: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        System.out.println("Reszta wynosi: ");

        for(int i = 0; i < nominaly.length ; i++){
            if (x >= nominaly[i] && x != 0) {
                x = x - nominaly[i];
                System.out.print(nominaly[i] + ", ");
                i--;
            }
        }

    }
}
