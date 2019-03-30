package pl.sda.zadania_03_17;

import pl.sda.zadania_03_10.Employee;

import java.util.Arrays;
import java.util.List;

public class StreamsExample269 {
    public static void main(String[] args) {
        List<String> txt = Arrays.asList("ala", "Samochód", "kot", "aleksandra", "pies", "azor");
        txt.stream()
                .filter(element -> element.startsWith("a") || element.startsWith("A"))
                .map(element -> element.replace("a", "A"))

                .forEach(System.out::println);


        List<Employee> employees = Arrays.asList(
                new Employee("Jan", "Kowalski", 3900, 35),
                new Employee("Piotr", "Nowak", 4500, 38),
                new Employee("Ewa", "Kowalska", 2002, 33),
                new Employee("Anna", "Nowak", 3300, 22)
        );
                employees.stream()
                .filter(employee -> employee.calcSalary() < 4000 && employee.getAge() > 30)
                        .forEach(employee ->
                                System.out.println(employee.getFirstName() + " " + employee.getLastName()+ " "));
    }
}
