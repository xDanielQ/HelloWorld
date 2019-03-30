package pl.sda.Pd.Zjazd1;

public class for5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            int x = 2;
            int y = 3;
            int z = 5;
            if (i % x == 0 && i % y == 0 && i % z == 0) {
                System.out.println(i + ", podzielne przez " + x + ", podzielne przez " + y + ",  podzielne przez " + z);
            } else if (i % x == 0 && i % y == 0) {
                System.out.println(i + ", podzielne przez " + x + ", podzielne przez " + y);
            } else if (i % x == 0  && i % z == 0) {
                System.out.println(i + ", podzielne przez " + x + ",  podzielne przez " + z);
            } else if (i % y == 0 && i % z == 0) {
                System.out.println(i + ", podzielne przez " + y + ",  podzielne przez " + z);
            }else if (i % x == 0) {
                System.out.println(i + ", podzielne przez " + x );
            }else if (i % y == 0) {
                System.out.println(i + ", podzielne przez " + y );
            }else if (i % z == 0) {
                System.out.println(i + ", podzielne przez " + z );
            } else {
                System.out.println(i + " jest liczbą pierwszą");
            }
        }
    }
}
