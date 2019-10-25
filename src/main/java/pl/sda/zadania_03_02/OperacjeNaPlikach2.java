package pl.sda.zadania_03_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OperacjeNaPlikach2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("ala.txt"); //zadeklarowani do metody file nazwy pliku bądz lokalizacji pliku
        Scanner scanner = new Scanner(file); //scanner który odczytuje zawartość pliku przypisanego do file

        while (scanner.hasNext()){ //petla która wczytuje kolejno linie pliku
            readSingleLine(scanner); //wykonuje oodczyt linii przez scaner z metody readSigleLine
        }
    }

    static void readSingleLine(Scanner scanner) throws FileNotFoundException { //alt + enter nacisnąc gdy podkreśla na czerwono zawartość instrukcji
        // doda wtedy wyjątek do metody mówiący że plik może nie istniec (jestli nie ma pliku wyrzuci blad)
        String line = scanner.nextLine(); //zwraca zawartość pliku llinia po linijce
        System.out.println("Wczytana linia : " + line);
    }
}
