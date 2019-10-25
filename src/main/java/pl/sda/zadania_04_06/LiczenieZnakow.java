package pl.sda.zadania_04_06;

import java.util.HashMap;
import java.util.Map;

public class LiczenieZnakow {
    public static void main(String[] args) {

        Map<Character, Integer> owocowo = zliczanie("owocowo");
        for (Map.Entry<Character, Integer> literka : owocowo.entrySet()) {
            System.out.println(literka.getKey() + ": " + literka.getValue());
        }
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
    }
