package pl.sda.Pd.Zjazd2;

public class Zad5Tab {
    public static void main(String[] args) {
        int[] tab = new int[] {2, 5, 9, 5, 7, 2};
        System.out.println(getMax(tab));
        System.out.println(getMin(tab));
        System.out.println(getSum(tab));
        printTab(getMaxMinSum(tab));

    }
    static int getMax (int[] tab) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++){
            if(tab[i] >= max) {
                max = tab[i];
            }
        }
        return max;
    }
    static int getMin (int[] tab) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++){
            if(tab[i] <= min) {
                min = tab[i];
            }
        }
        return min;
    }
    static int getSum (int[] tab) {
        int sum = 0;
        for(int i = 0; i < tab.length; i ++) {
            sum += tab[i];
        }
        return sum;
    }
    static int[] getMaxMinSum(int[] tab) {

        return new int[] {getMax(tab),getMin(tab), getSum(tab)};
    }
    static void printTab(int[] tab){
        for(int i = 0; i < tab.length; i++) {
            System.out.println("Wyliczone elementy tablicy: ");
            System.out.println(tab[i] + " ");
        }
    }

}
