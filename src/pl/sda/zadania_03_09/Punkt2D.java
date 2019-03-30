package pl.sda.zadania_03_09;

public class Punkt2D {
     int x;
     int y;

    public Punkt2D(){

    }
    public Punkt2D (int x, int y) {
        this.x = x;
        this.y = y;
//
//        System.out.println("Podaj pierwszą współrzędną: ");
//        Scanner scanner = new Scanner(System.in);
//        x = scanner.nextInt();
//        System.out.println("Podaj drugą współrzędną: ");
//        y = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Punkt2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
