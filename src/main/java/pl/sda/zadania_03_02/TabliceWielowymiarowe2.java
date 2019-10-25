package pl.sda.zadania_03_02;

public class TabliceWielowymiarowe2 {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];


        for(int j = 0; j < tab.length; ++j) {
            tab[j][j] = j;

        }
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");

            }
            System.out.println(" ");
        }

    }
}
