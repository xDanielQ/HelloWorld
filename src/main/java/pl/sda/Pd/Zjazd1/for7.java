package pl.sda.Pd.Zjazd1;

public class for7 {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        for (int i = 1; i <= 459; i++) {

            x = 3 + 2 * i;

            y = y + x;

            if (i == 459) {
                System.out.println(y);
            }
        }
    }
}
