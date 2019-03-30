package pl.sda.zadania_03_09;

public class Czas {
    private int minuty;
    private int godziny;

    public Czas(int minuty, int godziny){
        this.minuty = minuty;
        this.godziny = godziny;

    }

    public Czas dodaj(Czas t) {
        int minutyPom;
        int godzinyPom;

        minutyPom = (this.minuty + t.minuty) % 60;
        double m = (this.minuty + t.minuty) / 60;
        godzinyPom = this.godziny + t.godziny + (int)m;

        return new Czas(minutyPom, godzinyPom);
    }

    @Override
    public String toString() {
        return godziny + "h " + minuty + "min";
    }

    public Czas odejmij (Czas t){
        int minutyPom;
        int godzinyPom;
        minutyPom = (this.minuty - t.minuty) % 60;

        godzinyPom = this.godziny - t.godziny ;
        return new Czas(minutyPom,godzinyPom);
    }
    public Czas pomnoz (Czas t){
        int minutyPom;
        int godzinyPom;
        minutyPom = (this.minuty * t.minuty) % 60;
        double m = (this.minuty * t.minuty) / 60;
        godzinyPom = this.godziny * t.godziny + (int)m;
        return new Czas(minutyPom,godzinyPom);
    }
}
