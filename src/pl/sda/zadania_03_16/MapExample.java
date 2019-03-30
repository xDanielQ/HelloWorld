package pl.sda.zadania_03_16;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> oceny = new HashMap<>();
        oceny.put("Matematyka", 3);
        oceny.put("Angielski", 5);

        for(Map.Entry<String, Integer> element : oceny.entrySet()){
            System.out.println("Przedmiot " + element.getKey() + " " + element.getValue());
        }
    }
}
