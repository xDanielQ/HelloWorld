package pl.sda.zadania_04_07;


import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        double[] tab = {5, 1, 2, 3, 5};
        double[] tab2 = {5, 1, 0};
        double[] tab3 = zad3(tab, tab2);
        for(int i = 0; i < tab3.length; i++){
            System.out.println((i+1) + " : " + tab3[i]);
        }



    }

    public static double[] zad3(double [] tab1, double[] tab2){
        double wieksza[];
        int wielkoscMniejszej;
        if (tab1.length >= tab2.length) {
            wieksza = tab1;
            wielkoscMniejszej = tab2.length;
        }else {
            wieksza = tab2;
            wielkoscMniejszej = tab1.length;
        }

        for (int i = 0; i < wielkoscMniejszej; i++) {
            wieksza[i] = tab1[i] + tab2[i];
        }
return wieksza;
    }
}
