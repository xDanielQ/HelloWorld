package pl.sda.zadania_03_17;

import java.util.Arrays;
import java.util.List;

// SLAJD 268

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 10, 9, 13, 6);

        list.stream()
                .filter(element -> element % 2 != 0)
                .map(element -> element * 100)
                .forEach(System.out::println);
    }
}
