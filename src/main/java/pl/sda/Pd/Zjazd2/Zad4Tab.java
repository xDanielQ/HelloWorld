package pl.sda.Pd.Zjazd2;

public class Zad4Tab {
    public static void main(String[] args) {

        Sum x = new Sum();

        x.tab = new int[]{1, 4, 20, 9};


        System.out.println("Suma wszystkich elementow z tablicy to: " + x.getSuma());
    }
}

class Sum {
    int[] tab;
    int suma;

    int getSuma() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Wartosc tablicy: " + tab[i]);
            suma += tab[i];
        }
        System.out.println("Suma: " + suma);
        return suma;
    }
}

