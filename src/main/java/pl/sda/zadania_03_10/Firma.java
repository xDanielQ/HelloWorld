package pl.sda.zadania_03_10;

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


    public double obliczMiesiecznyKosztFirmy() {
        double kosztM = 0;
        for (int i = 0; i < pracownicy.length; i++)
            kosztM += pracownicy[i].getSalary();
        return kosztM;
    }

    public double obliczRocznyKosztFirmy() {

        return obliczMiesiecznyKosztFirmy() * 12;
    }

     public double obliczDziennyKosztFirmy() {
        return obliczMiesiecznyKosztFirmy() / 30;
    }

    public double obliczKosztFirmy(CzasEnum czas) {
        switch (czas) {
            case DZIEN:
                return obliczDziennyKosztFirmy();
            case MIESIAC:
                return obliczMiesiecznyKosztFirmy();
            case ROK:
                return obliczRocznyKosztFirmy();
            default:
                throw new IllegalArgumentException("Brak obsługi dla podanej wartości");
        }
    }
}
