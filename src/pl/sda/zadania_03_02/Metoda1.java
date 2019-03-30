package pl.sda.zadania_03_02;

public class Metoda1 {
    public static void main(String[] args) {
        int c = multiply(20,30);
        System.out.println(c);

        System.out.println(concatenate("lancch 1", "lancuch 2"));

    }
    //mnożenie
    static int multiply(int a, int b){
        return a * b;
    }
//konkantenacja ciągu znaków
    static String concatenate(String c, String d){
        return c + '\n' + d;
    }
}
