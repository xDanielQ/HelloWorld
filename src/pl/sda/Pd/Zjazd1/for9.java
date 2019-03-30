package pl.sda.Pd.Zjazd1;

public class for9 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++ ) {
            for(int j = n; j > i; j--){
                System.out.print('*');
            }
            System.out.println('\n');
        }
    }
}
