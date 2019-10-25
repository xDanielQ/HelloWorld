package pl.sda.zadania_03_10;

public class Pracownik {


    private String imie;
    private String nazwisko;
    private double salary;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Pracownik(String imie, String nazwisko, double salary) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.salary = salary;
    }
}
