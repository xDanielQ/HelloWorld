package pl.sda.zadania_05_25.proxy.user;

public class User {

    private final String email;
    private final String login;

    public User(String email, String login) {
        this.email = email;
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
