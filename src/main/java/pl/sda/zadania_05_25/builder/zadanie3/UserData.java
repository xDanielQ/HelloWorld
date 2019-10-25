package pl.sda.zadania_05_25.builder.zadanie3;

public class UserData {
    private final String firstName;
    private final String lastName;
    private final String country;
    private final String birthDate;
    private final String mail;

    public UserData(String firstName, String lastName, String country, String birthDate, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.birthDate = birthDate;
        this.mail = mail;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
