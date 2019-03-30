package pl.sda.Pd.Zjazd1;

public class zad1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 4;

        if (a > b && a > c) {
            System.out.println(a);
        }else if (b > a && b > c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
