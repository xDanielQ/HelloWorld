package pl.sda.zadania_02_24;

public class Konwersja {
    public static void main(String[] args) {
        int a = 10;
        byte b = 5;
        char zero = 8;

        float f = (float)  (a + b);

        System.out.println(f);

        int znak = (int) (zero + b);

        System.out.println(znak);
    }
}
