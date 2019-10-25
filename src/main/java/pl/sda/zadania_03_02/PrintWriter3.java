package pl.sda.zadania_03_02;

import java.io.*;
import java.util.Scanner;

public class PrintWriter3 {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        final String imie = scanner.nextLine();



        PrintWriter zapis = new PrintWriter(new BufferedWriter(new FileWriter("test.txt", true)));
        zapis.print('\n' + imie);
        zapis.close();

        System.out.println("Odczytane linie z pliku: ");

        readFromFile("test.txt");

    }

    public static void readFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner;
        File file = new File(fileName);
        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            readSingleLine(scanner);
        }
    }

    public static String readSingleLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        return scanner.nextLine();
    }

    public static void readSingleLine(Scanner scanner) throws FileNotFoundException {
        String line = scanner.nextLine();
        System.out.println("Wczytana linia : " + line);
    }


}

