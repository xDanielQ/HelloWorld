package pl.sda.zadania_02_24;

public class kalkulator {
    public static void main(String[] args) {
        double a = 10;
        double b = 2;
        double c = 3;
        System.out.println((a + b) * c);
        ++a; ++b; ++c;
        System.out.println(a - b / c);
        ++a; ++b; ++c;
        System.out.println(b % (a * c));
    }
}
