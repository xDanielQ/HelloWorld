package pl.sda.zadania_03_31;


public class SilniaIt {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę do obliczenia ciagu Fibonacciego");
        int x = 19;
        int silnia = 1;
        for (int i = 1; i <= x; i++) {
            silnia *= i;
        }
        System.out.println(silnia);
    }
}
