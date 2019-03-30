package pl.sda.zadania_03_16;

public class KlasaString {

    public static boolean sprawdzTablice (String[] tab) {
        for(int i = 0; i < tab.length; i++){
            if(tab[i].startsWith("abc")){
                return true; //return wychodzi z pętli i metody z wynikiem true
            }
        }
        return false; //gdy pętla nie znajdzie wyniku, zwróci false w metodzie
    }
    public static boolean sprawdzTablice2 (String[] tab) {
        for(int i = 0; i < tab.length; i++){
            if(tab[i].endsWith("cde")){
                return true; //return wychodzi z pętli i metody z wynikiem true
            }
        }
        return false; //gdy pętla nie znajdzie wyniku, zwróci false w metodzie
    }
}
