package pl.sda.zadania_03_09;

public class TestPojazd {
    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd(4, "czerwony", 200 );
        pojazd.drukujInfo();
        Pojazd pojazd1 = new Pojazd(4, "czerwony");
        pojazd1.drukujInfo();
    }
}
