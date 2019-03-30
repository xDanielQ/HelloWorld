package pl.sda.Pd.Zjazd2;

public class Zad8Tab {
    public static void main(String[] args) {
        int[] tab = new int[]{2, 5, 6, 5, 9, 101, 2, 102, 101, 9, 1023, 1023, 100};
        Integer[] tab2 = new Integer[]{2, 5, 6, 5, 9, 101, 2, 102, 101, 9, 1023, 1023, 100};

        System.out.println("Maksymalna wartość tablicy: " + getMax(tab));
        System.out.println("Minimalna wartość tablicy: " + getMin(tab));
        System.out.println("Suma wartości tablicy: " + getSum(tab));

        printTab(getMaxMinAndSum(tab));

        printTab2(getDistinct(tab2));
    }

    static int getMax(int[] tab) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= max) {
                max = tab[i];
            }
        }

        return max;
    }

    static int getMin(int[] tab) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] <= min) {
                min = tab[i];
            }
        }

        return min;
    }

    static int getSum(int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }

        return sum;
    }

    static int[] getMaxMinAndSum(int[] tab) {
        return new int[]{getMax(tab), getMin(tab), getSum(tab)};
    }

    static void printTab(int[] tab) {
        System.out.println("Wyliczone elementy tablicy: ");
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    static void printTab2(Integer[] tab) {
        System.out.println("Wyliczone elementy tablicy: ");
        for(int i = 0; i < tab.length; i++) {
            if (tab[i] != null) {
                System.out.print(tab[i] + " ");
            }
        }
    }

    static Integer[] getDistinct(Integer[] tab) {
        Integer[] wyj = new Integer[tab.length];
        int k = 0;

        for (int i = 0; i < tab.length; i++) {
            boolean found = false;
            for (int j = 0; j < wyj.length; j++) {
                if (wyj[j] != null && wyj[j].equals(tab[i])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                wyj[k] = tab[i];
                ++k;
            }
        }

        return wyj;
    }

}