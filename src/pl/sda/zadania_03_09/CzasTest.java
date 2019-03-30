package pl.sda.zadania_03_09;

public class CzasTest {
    public static void main(String[] args) {
        Czas czas1 = new Czas(12, 12);
        System.out.println("Dodany czas: " + czas1.dodaj(new Czas(50, 12)).toString());
        System.out.println("Po odejmowaniu czas: " + czas1.odejmij(new Czas(6,5)));
        System.out.println("Po mnożeniiu czas: " + czas1.pomnoz(new Czas(6,5)));

    }
}
