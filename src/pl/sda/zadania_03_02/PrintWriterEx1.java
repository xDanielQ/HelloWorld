package pl.sda.zadania_03_02;

import java.io.*;
import java.util.Scanner;

public class PrintWriterEx1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        final String imie = scanner.nextLine();

        PrintWriter zapis = new PrintWriter(new BufferedWriter(new FileWriter("test.txt", true)));
        zapis.print('\n' + imie);
        zapis.close();
    }

}
