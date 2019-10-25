package pl.sda.zadania_03_09;

public class Punkt {
    int x = 55;
    int y = 23;


    public void zmien(Punkt pkt) {
        pkt.x = x++;
        pkt.y = y++;
        System.out.println("Współrzędna x: " + x + '\n' + "Współrzędne y: " + y);
    }

    public void zmienWart(int z) {

        this.x += z;
        this.y += z;
        System.out.println("Współrzędna x: " + x + '\n' + "Współrzędne y: " + y);
    }

    public void piszCord(int x, int y) {
        System.out.println("Współrzędna x: " + x + '\n' + "Współrzędne y: " + y);
    }
}



