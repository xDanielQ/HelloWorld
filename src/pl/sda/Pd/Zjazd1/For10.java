package pl.sda.Pd.Zjazd1;

public class For10 {
    public static void main(String[] args) {
        int n = 5;
        String x = " ";

        for (int i = 0; i < n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = n; j > i; j--)
                System.out.print('*');
        }

        System.out.print('\n');
    }
}


