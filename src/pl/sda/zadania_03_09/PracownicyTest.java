package pl.sda.zadania_03_09;

public class PracownicyTest {
    public static void main(String[] args) {
        Pracownik[] pracownicyFirmy = new Pracownik[]{
                new Pracownik("Jan", "Kowalski", 20),
                new Pracownik("Tomasz", "Nowak", 30),
                new Pracownik("Katarzyna", "Nowak", 25),
        };
        Firma firma = new Firma(pracownicyFirmy);

//        firma.drukujPracownikow(); //druga opcja gdzie kod poniżej jest zastąpiony zakomentowaną linijką
        Pracownik[] pracownicy = firma.getPracownicy();
        for(int i = 0; i < firma.getPracownicy().length; i++){
            System.out.println("Imię: " + pracownicy[i].getImie()
                    + ", nazwisko: " + pracownicy[i].getNazwisko()
                    + ", wiek: " + pracownicy[i].getWiek());
        }
    }
}
