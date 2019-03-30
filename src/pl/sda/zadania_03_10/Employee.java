package pl.sda.zadania_03_10;

public class Employee extends Person implements Iemployee {
    Employer employer;
    double calcSalary;
    private int age;

    public Employee(String firstName, String lastName, Employer employer, double calcSalary) {
        super(firstName, lastName);
        this.employer = employer;
        this.calcSalary = calcSalary;

    }

    public int getAge() {
        return age;
    }



    public Employee(String firstName, String lastName, double calcSalary, int age) {
        super(firstName, lastName);
        this.calcSalary = calcSalary;
        this.age = age;
    }

    @Override
    public Employer getEmployer() {
        return employer;
    }

    @Override
    public double calcSalary() {
        return calcSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employer=" + employer +
                ", calcSalary=" + calcSalary +
                '}';
    }
}
