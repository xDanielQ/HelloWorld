package pl.sda.zadania_03_16;

import pl.sda.zadania_03_10.Person;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Jan", "Kowalski"));
        personList.add(new Person("krzysztof", "nowak"));
        for(Person person : personList){
            System.out.println(person);
        }
    }
}
