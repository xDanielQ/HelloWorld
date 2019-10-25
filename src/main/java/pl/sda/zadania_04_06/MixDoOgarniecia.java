package pl.sda.zadania_04_06;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MixDoOgarniecia {
    public static void main(String[] args) {
//        wystepowanie("BCACCAABCBCACAACAC", "BCA");
//        palindrome("BCACCAABCBCACAACAC");
        String fileName = "C:\\Users\\Daniel\\IdeaProjects\\HelloWorld\\src\\pl\\sda\\zadania_04_06\\filename.txt";
        String fileName2 = "C:\\Users\\Daniel\\IdeaProjects\\HelloWorld\\src\\pl\\sda\\zadania_04_06\\filename2.txt";


        //poniżej wypisuje zawartość listy - w tym wypadku same palindromy (już bez true i false
//        System.out.println(getPalindromes("BCACCAABCBCACAACAC"));


        //ponizej wypisuje wynik wyszukiwania samych palindromow do pliku (tylko z wartością true)
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {
//            List<String> pali = getPalindromes("BCACCAABCBCACAACAC");
//            for (String s : pali) {
//                bw.write(s + ", ");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        wspolnyString("AAABBA", "ABAABBAAA");

    }


    public static void wystepowanie(String wejsciowa, String wystepujaca) {
        char[] znak = wejsciowa.toCharArray();
        char[] znak2 = wystepujaca.toCharArray();
        int pom = 0;
        int poczatek = 0;
        int koniec = 0;
        for (int i = 0; i < znak.length; i++) {
            if (znak[i] == znak2[pom]) {
                if (pom == 0) {
                    poczatek = i;
                }
                pom++;
            } else {
                pom = 0;
                poczatek = 0;
                koniec = 0;

            }
            if (pom == znak2.length) {
                System.out.println("Mamy to!");
                koniec = i;
                System.out.println("poczatek: " + poczatek + " koniec " + koniec);
                pom = 0;

            }
        }

    }

    public static boolean palindrome(String tekst) {

//        StringBuilder stringBuilder = new StringBuilder(tekst); //DOWIEDZIEC SIE O CO CHODZI
//        stringBuilder.append("cos"); //PRAWDOPODOBNIE BUDOWANIE CIĄGÓW ZNAKÓW I ICH MODYFIKOWANIE
//        String s = stringBuilder.toString();

        tekst = tekst.replace(",", ""); //zamiana wybranych znaków (aby je pominąć)
        tekst = tekst.replace(" ", "");
        tekst = tekst.replace("!", "");

        char[] chars = tekst.toCharArray(); //metoda która zmienia ciąg znaków na znaki (pojedyncze)
        String reverseTekst = "";
        for (int i = chars.length - 1; i >= 0; i--) { //przypisanie indeksu do każdego znaku w ciągu znaków

            reverseTekst = reverseTekst + chars[i];

        }
        if (tekst.equalsIgnoreCase(reverseTekst)) { //

            return true;
        }
        return false;
    }

    public static List<String> getPalindromes(String ciagZnakow) {
        char[] chars = ciagZnakow.toCharArray();
        List<String> palindromy = new ArrayList<>();
        for (int start = 0; start < chars.length - 1; start++) {
            for (int koniec = chars.length; koniec >= 0; koniec--) {
                if (koniec == start + 1) {
                    break;
                }
                String substring = ciagZnakow.substring(start, koniec);
//                    System.out.println(substring + " : " + palindrome(substring)); //wypisuje wszystkie możliwości z
//                    informacja true lub false
                if (palindrome(substring)) {
                    palindromy.add((substring)); //dodaje do listy wylacznie palindromy
                }
            }

        }
        return palindromy;
    }

    public static void wspolnyString(String pierwszy, String drugi) {
        Map<String, Integer> wspolneStringi = new HashMap<>();
        char[] chars;
        String wiekszy;
        String mniejszy;
        if (pierwszy.length() < drugi.length()) {
            chars = drugi.toCharArray();
            wiekszy = pierwszy;
            mniejszy = drugi;
        } else {
            chars = pierwszy.toCharArray();
            wiekszy = drugi;
            mniejszy = pierwszy;
        }


        for (int start = 0; start < chars.length - 1; start++) {

            for (int koniec = chars.length; koniec >= 0; koniec--) {
                if (koniec == start + 1) {
                    break;
                }
                String noweSlowo = mniejszy.substring(start, koniec);
                if (wiekszy.contains(noweSlowo)) {

                   wspolneStringi.put(noweSlowo, noweSlowo.length());
                }
            }

        }

        int maximum = 0;
        String najwiekszeSlowo = "";
        for (Map.Entry<String, Integer> pojedynczyElement : wspolneStringi.entrySet()) {
            if (maximum < pojedynczyElement.getValue()) {
                maximum = pojedynczyElement.getValue();
                najwiekszeSlowo = pojedynczyElement.getKey();
            }
        }
        System.out.println("Najdluzszy wspolny ciag znakow to: " + najwiekszeSlowo + ", i ma az " + maximum + " znakow.");
    }
}
