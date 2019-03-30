package pl.sda.zadania_03_02;

public class TabWielo3 {
    public static void main(String[] args) {
        int[][] tab = new int[2][3];
        int value = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) { //tab[i].lenght odwołuje się do długości wiersza w tym wypadku 3
                tab[i][j] = value++;
                        System.out.print(tab[i][j] + " ");

            }
            System.out.println(" ");
        }

    }
}
