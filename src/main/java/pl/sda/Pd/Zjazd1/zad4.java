package pl.sda.Pd.Zjazd1;

public class zad4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 4;
        int d = 1;

        if (a > b && a > c && a > d) {
            System.out.println(a);
        }else if (b > a && b > c && b > d) {
            System.out.println(b);
        }else if (c > a && c > b && c > d){
            System.out.println(c);
        }else {
            System.out.println(d);
        }
    }
}
