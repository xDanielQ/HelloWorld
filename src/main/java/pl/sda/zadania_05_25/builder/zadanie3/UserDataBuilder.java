package pl.sda.zadania_05_25.builder.zadanie3;

public class UserDataBuilder {
    private  String firstName;
    private  String lastName;
    private  String country = "Polska";
    private  String birthDate = "1980";
    private  String mail = "";

    public void setFirstName(String firstName) throws NullPointerException {
        if(firstName == null){
            throw new NullPointerException("Pole nie moze zostac puste");
        }else{
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) throws NullPointerException {
        if(lastName == null){
            throw new IllegalArgumentException("Pole nie moze zostac puste");
        }else {
            this.lastName = lastName;
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public UserData build() throws NullPointerException {
        if(firstName == null){
            throw new NullPointerException("Pole nie moze zostac puste");
        }if(lastName == null){
            throw new NullPointerException("Pole nie moze zostac puste");
        }

        return new UserData(firstName,
                lastName,
                country,
                birthDate,
                mail);
    }
}
