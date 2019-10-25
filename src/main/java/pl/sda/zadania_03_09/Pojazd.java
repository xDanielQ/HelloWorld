package pl.sda.zadania_03_09;

public class Pojazd {


    private int liczbakol;
    private String kolor;
    private int predkosc;


    public Pojazd(int liczbakol, String kolor, int predkosc) {
        this.liczbakol = liczbakol;
        this.kolor = kolor;
        this.predkosc = predkosc;

    }

    //pozwala na wprowadzenie tylko dwóch parametrów a trzecia wartość jest ustawiona jako argument domyśny;
    public Pojazd(int liczbakol, String kolor) {
        this.liczbakol = liczbakol;
        this.kolor = kolor;
        this.predkosc = 100;
    }

    public void drukujInfo() {
        System.out.println("Twój pojazd ma " + liczbakol + " koła, jest " + kolor + " i moze jechać z prędkośćią " + predkosc + "km/h");
    }
}
