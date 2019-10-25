package pl.sda.zadania_03_10;
//po wpisaniu extends nacisnac alt + enter i wybrac pierwszą opcję // tak samo z implements
public class Employer extends Person implements Iemployer{

    private String name;

    public Employer(String firstName, String lastName, String name) {
        super(firstName, lastName);
        this.name = name;
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName() + '\n' +
                "Last name: " + getLastName() + '\n' +
                "Company name: " + name;
    }


    @Override
    public String getCompany() {
        return name;
    }
}
