package pl.sda.zadania_03_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OperacjeNaPlikach1 {
    public static void main(String[] args) throws FileNotFoundException {
        readTxtFile();
    }

    static void readTxtFile() throws FileNotFoundException {
        File file = new File("ala.txt"); //zadeklarowani do metody file nazwy pliku bądz lokalizacji pliku
        Scanner scanner = new Scanner(file); //scanner który odczytuje zawartość pliku przypisanego do file
        String line = scanner.nextLine(); //zwraca pierwszą linię z pliku zadeklarowanego linijkę wyżej
        System.out.println("Wczytana linia : " + line);
    }
}
