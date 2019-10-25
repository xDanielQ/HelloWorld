package pl.sda.zadania_04_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromyV001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj wyraz");
//        String word = scanner.nextLine();
//        System.out.println(palindrome(word));


        Integer x = scanner.nextInt();
        System.out.println(palindrome(x));

        Map<Character, Integer> owocowo = zliczanie("owocowo");
        for (Map.Entry<Character, Integer> literka : owocowo.entrySet()) {
            System.out.println(literka.getKey() + ": " + literka.getValue());
        }

    }

    public static boolean palindrome(String tekst) {

        StringBuilder stringBuilder = new StringBuilder(tekst); //DOWIEDZIEC SIE O CO CHODZI
        stringBuilder.append("cos"); //PRAWDOPODOBNIE BUDOWANIE CIĄGÓW ZNAKÓW I ICH MODYFIKOWANIE
        String s = stringBuilder.toString();

        tekst = tekst.replace(",", ""); //zamiana wybranych znaków (aby je pominąć)
        tekst = tekst.replace(" ", "");
        tekst = tekst.replace("!", "");

        char[] chars = tekst.toCharArray(); //metoda która zmienia ciąg znaków na znaki (pojedyncze)
        String reverseTekst = "";
        for (int i = chars.length - 1; i >= 0; i--) { //przypisanie indeksu do każdego znaku w ciągu znaków

            reverseTekst = reverseTekst + chars[i];

        }
        System.out.println(reverseTekst);
        if (tekst.equalsIgnoreCase(reverseTekst)) { //

            return true;
        }
        return false;
    }

    public static boolean palindrome(Integer liczba) {
        liczba.toString();
        return palindrome(String.valueOf(liczba));
    }

    public static Map<Character, Integer> zliczanie (String tekst){
        Map<Character, Integer> licznik = new HashMap<>();
        char[] znak = tekst.toCharArray();
        for (int i = 0; i < znak.length; i++) {
            if (licznik.containsKey(znak[i])) {
                Integer pomocniczaLiczba = licznik.get(znak[i]) + 1;
                licznik.put(znak[i], pomocniczaLiczba);
            } else
                licznik.put(znak[i], 1);
        }

        return licznik;
    }
    public static void wspolnyString (String pierwszy, String drugi){}

    public static void getPalindromes (String ciagZnakow){
        char[] chars = ciagZnakow.toCharArray();
        for (int start = 0; start < chars.length - 1; start++){{
            for(int koniec = chars.length; koniec >= 0; koniec-- ) {
                if(koniec == start+1){
                    break;
                }
                String substring = ciagZnakow.substring(start, koniec);
                System.out.println(substring);
            }
        }}
    }


}
