package pl.sda.zadania_05_25.builder.zadanie3;

public class Main {
    public static void main(String[] args) {
        UserDataBuilder builder = new UserDataBuilder();
        UserData data = builder.build();
        System.out.println(data);

        builder.setFirstName("Jan");
        builder.setLastName("Kowalski");
        UserData data1 = builder.build();
        System.out.println(data1);

    }
}
