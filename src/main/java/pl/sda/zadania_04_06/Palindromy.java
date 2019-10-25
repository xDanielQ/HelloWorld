package pl.sda.zadania_04_06;

import java.io.*;

public class Palindromy {
    public static void main(String[] args) {
        palindrome("kajak");
        String fileName = "C:\\Users\\Daniel\\IdeaProjects\\HelloWorld\\src\\pl\\sda\\zadania_04_06\\filename.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("");
    }

    public static boolean palindrome(String tekst) {
        char[] chars = tekst.toCharArray(); //metoda która zmienia ciąg znaków na znaki (pojedyncze)
        String reverseTekst = "";
        for (int i = chars.length - 1; i >= 0; i--) { //przypisanie indeksu do każdego znaku w ciągu znaków
            reverseTekst = reverseTekst + chars[i];
        }
        System.out.println(reverseTekst);
        if (tekst.equalsIgnoreCase(reverseTekst)){ //
            return true;
        }

        return true;
    }

}
