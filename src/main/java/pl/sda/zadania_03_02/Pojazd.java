package pl.sda.zadania_03_02;

public class Pojazd {
    private String kolor;
    private int liczbaKol;

    public Pojazd() {

    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setLiczbaKol(int liczbaKol) {
        this.liczbaKol = liczbaKol;
    }

    public Pojazd(String kolor, int liczbaKol) {
        this.kolor = kolor;
        this.liczbaKol = liczbaKol;
    }

    public int getLiczbaKol() {
        return liczbaKol;

    }
}
