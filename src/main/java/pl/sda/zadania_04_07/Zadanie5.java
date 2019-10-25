package pl.sda.zadania_04_07;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] tablica = {4,5,6,1,4,3,9, 1,3};

        System.out.println("Najwyższa wartość w tablicy wynosi " + findMax(tablica));
        System.out.println("Najmniejsza wartość w tablicy wynosi " + findMin(tablica));
    }

    public static int findMin (int[] tab1 ){
        int min = tab1[0];
        for(int i = 0; i <tab1.length; i++){
            if(tab1[i] < min){
                min = tab1[i];
            }

        }return min;
    }

    public static int findMax (int[] tab1 ){
        int max = tab1[0];
        for(int i = 0; i <tab1.length; i++){
            if(tab1[i] > max){
                max = tab1[i];
            }

        }return max;
    }
}
