package pl.sda.zadania_05_25.proxy.Zadanie;

public class User {

    private final String password;



    public User(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                '}';
    }
}
