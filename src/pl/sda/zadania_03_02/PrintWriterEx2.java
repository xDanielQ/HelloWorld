package pl.sda.zadania_03_02;


import java.io.*;
import java.util.Scanner;

public class PrintWriterEx2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        final String imie = scanner.nextLine();

        File file = writeToFile(imie);



        System.out.println("Odczytane linie z pliku: ");

        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            readSingleLine(scanner);

        }
    }

    private static File writeToFile(String imie)  {
        File file = new File("test.txt");
        PrintWriter zapis = null;
        try {
            zapis = new PrintWriter(new BufferedWriter(new FileWriter("test.txt", true)));
        } catch (IOException e) {
            System.out.println("Nie ma takiego pliku");;
        }
        zapis.print('\n' + imie);
        zapis.close();
        return file;
    }

    private static String readSingleLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        return scanner.nextLine();
    }

    static void readSingleLine(Scanner scanner) throws FileNotFoundException {
        String line = scanner.nextLine();
        System.out.println("Wczytana linia : " + line);
    }


}
