package pl.sda.zadania_03_02;

public class TabliceZad1 {
    public static void main(String[] args) {
        int[] tab = new int[4];
        tab[0] = 1;
        tab[1] = 3;
        tab[2] = 5;
        tab[3] = 10;
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);

        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for(int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.println(tab[i]);
            }
        }

        for(int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                System.out.println(tab[i]);
            }
        }

        for (int i = tab.length - 1 ; i >= 0; i--) {
            System.out.println(tab[i]);
        }

    }
}
