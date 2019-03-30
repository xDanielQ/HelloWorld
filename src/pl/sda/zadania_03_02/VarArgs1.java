package pl.sda.zadania_03_02;

public class VarArgs1 {
    public static void main(String[] args) {

        System.out.println(valueInt(2, 2, 2, 2, 2));

    }

    public static int valueInt(int... args) {
        int wynik = 1;
        for (int i = 0; i < args.length; ++i) {
            wynik *= args[i];
        }
        return wynik;
    }
}
