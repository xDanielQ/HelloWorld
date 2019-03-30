package pl.sda.zadania_03_10;

public class Market {
    public static void main(String[] args) {
        Employer employer = new Employer("Dorotka", "Tymoszuk", "PG4");
        System.out.println(employer.toString());


        Employee employee = new Employee("Piotr", "Nowak", employer, 4500);
        System.out.println(employee.toString());
    }
}