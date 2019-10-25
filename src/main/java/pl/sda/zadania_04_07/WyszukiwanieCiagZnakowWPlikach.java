package pl.sda.zadania_04_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WyszukiwanieCiagZnakowWPlikach {

    public static void main(String[] args) {

        System.out.println(zlicz("France"));


    }


    public static int zlicz (String szukanyTekst){
        String data = "C:\\Users\\Daniel\\IdeaProjects\\HelloWorld\\src\\pl\\sda\\zadania_04_07\\data.txt";
        int licznik = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line;
            int lineCounter = 1;
            while ((line = br.readLine()) != null) {
                if(line.contains(szukanyTekst)){
                    System.out.println("Linia : " + lineCounter + " zawiera " + szukanyTekst);
                    licznik++;
                }
                lineCounter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  licznik;
    }




}
