package pl.sda.zadania_04_06;


public class LiczbaWystapien {
    public static void main(String[] args) {
        wystepowanie("BCACCAABCBCACAACAC", "BCA");
    }

    public static void wystepowanie (String wejsciowa, String wystepujaca) {
        char[] znak = wejsciowa.toCharArray();
        char[] znak2 = wystepujaca.toCharArray();
        int pom = 0;
        int poczatek = 0;
        int koniec = 0;
        for (int i = 0; i <znak.length; i++){
            if( znak[i] == znak2[pom] ) {
                if( pom ==0) {
                    poczatek = i;
                }
                pom++;
            } else {
                pom = 0;
                poczatek = 0;
                koniec = 0;

            }
            if (pom == znak2.length){
                System.out.println("Mamy to!");
                koniec = i ;
                System.out.println("poczatek: " + poczatek + " koniec " + koniec);
                pom = 0;

            }
        }

    }

}
