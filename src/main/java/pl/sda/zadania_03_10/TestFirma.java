package pl.sda.zadania_03_10;

public class TestFirma {
    public static void main(String[] args) {
        Pracownik[] pracownicyFirmy = new Pracownik[]{
                new Pracownik("Jan", "Kowalski", 2000),
                new Pracownik("Tomasz", "Nowak", 3000),
                new Pracownik("Katarzyna", "Nowak", 2500),
        };
        Firma firma = new Firma(pracownicyFirmy);

        Pracownik[] pracownicy = firma.getPracownicy();
        for(int i = 0; i < firma.getPracownicy().length; i++){
            System.out.println("Imię: " + pracownicy[i].getImie()
                    + ", nazwisko: " + pracownicy[i].getNazwisko()
                    + ", zarobki: " + pracownicy[i].getSalary());
        }

        System.out.println("Miesięczny koszt firmy: " + firma.obliczMiesiecznyKosztFirmy());
        System.out.println("Roczny koszt firmy: " + firma.obliczRocznyKosztFirmy());


        System.out.println("Dzienny koszt firmy: " + firma.obliczKosztFirmy(CzasEnum.DZIEN));
        System.out.println("Miesięczny koszt firmy: " + firma.obliczKosztFirmy(CzasEnum.MIESIAC));
        System.out.println("Roczny koszt firmy: " + firma.obliczKosztFirmy(CzasEnum.ROK));
    }
}
