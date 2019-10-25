package pl.sda.zadania_03_16;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ostatnie {
    public static void main(String[] args) {
Map<String, String > wej = new HashMap<>();
wej.put("dasda", "sfoooasa");
wej.put("dadsda", "sfauuuusa");
wej.put("dasd4a", "sftttasa");
wej.put("dffasda", "sfggasa");
wej.put("dasdda", "sfadddsa");
wej.put("dasgda", "sfahgsa");

//nie wiem jakim cudem to działa >>> poszukaj filmików o HashMap, map, lista mapy itp
        System.out.println(transform(wej));
    }
    //rozkmiń co tu się dzieje?! -- > niby slajd 241
    public static Map<String, List<String>> transform(Map<String, String> wej){
        Map<String, List<String >> wyj = new HashMap<>();
        wyj.put("Klucze", new LinkedList<>(wej.keySet()));
        wyj.put("Wartości", new LinkedList<>(wej.values()));
        return wyj;
    }
}
