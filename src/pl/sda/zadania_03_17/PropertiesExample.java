package pl.sda.zadania_03_17;

import java.io.*;
import java.util.Properties;

//POCZYTAC ZA CO JAKA METODA/KLASA ODPOWIADA ORAZ JAK DZIAŁA
// + poczytać więcej o "foreach" jak działa gdzie się stosuje i czy częściej niż sama pętla for


public class PropertiesExample {
    public static void main(String[] args) {

        File file = new File("conf.properties");
        Properties properties = new Properties();
        InputStream inputStream;


        try {
            inputStream = new FileInputStream(file);
            properties.load(inputStream);

            properties.stringPropertyNames().stream()
                    .forEach(key -> System.out.println(key + " : " + properties.getProperty(key)));
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku properies!");
        }


    }



}
