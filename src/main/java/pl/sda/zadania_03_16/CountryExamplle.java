package pl.sda.zadania_03_16;


import java.util.*;

public class CountryExamplle {
    public static void main(String[] args) {


        Map<String, String> capCou = new HashMap<>();
        capCou.put("Polska", "Warszawa");
        capCou.put("Niemcy", "Berlin");
        capCou.put("Francja", "Paryż");


        Set<String> klucze = capCou.keySet();
        for (String key : klucze) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (String value : capCou.values()) {
            System.out.print(value + " ");
        }


        new LinkedList<>(capCou.keySet());


    }


}
