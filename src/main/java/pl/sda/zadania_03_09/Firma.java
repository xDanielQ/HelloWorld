package pl.sda.zadania_03_09;

public class Firma {

    public Pracownik[] getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(Pracownik[] pracownicy) {
        this.pracownicy = pracownicy;
    }

    private Pracownik[] pracownicy = new Pracownik[3];



    public Firma(Pracownik[] pracownicy) {
        this.pracownicy = pracownicy;
    }
//    DRUGA OPCJA GDZIE MAMY ODDZIELNĄ METODĘ WYPISUJĄCĄ PRACOWNIKÓW (WYSTARCZY ODKOMENTOWAC KOD PONIZEJ)
//    public void drukujPracownikow(){
//        for(int i = 0; i < this.pracownicy.length; i++){
//            System.out.println("Imię: " + this.pracownicy[i].getImie()
//                    + ", nazwisko: " + this.pracownicy[i].getNazwisko()
//                    + ", wiek: " + this.pracownicy[i].getWiek());
//        }
//    }
}
