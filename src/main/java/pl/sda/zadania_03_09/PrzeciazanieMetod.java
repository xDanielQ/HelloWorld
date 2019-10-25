package pl.sda.zadania_03_09;

public class PrzeciazanieMetod {
    int dodaj(int a, int b) {
        System.out.println("Return int");
        return a + b;
    }

    int dodaj(int a, int b, int c) {
        System.out.println("Return int(abc)");

        return a + b + c;
    }

    long dodaj(long a, int b) {
        System.out.println("Return long");

        return a + b;
    }

    int dodaj(short a, int b) {
        System.out.println("Return int (short,int");

        return a + b;
    }

}
