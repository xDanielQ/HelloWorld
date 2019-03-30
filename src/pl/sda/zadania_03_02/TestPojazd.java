package pl.sda.zadania_03_02;

public class TestPojazd {
    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd("czerwoy", 4);

        System.out.println("kolor: " + pojazd.getKolor() + " liczba kół: " + pojazd.getLiczbaKol());

    }
}
