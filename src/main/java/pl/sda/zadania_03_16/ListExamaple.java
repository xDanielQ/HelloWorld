package pl.sda.zadania_03_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExamaple {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,15, 55, 678, 1005, 2, 12, 15);

        System.out.println("Średnia arytmetyczna wynosi: " + zadanieLista(list));
    }

    public static double zadanieLista(List<Integer> list){
        int suma = 0;
        for(Integer element : list){
            suma += element;
        }
        return (double) suma / list.size();
    }
}

