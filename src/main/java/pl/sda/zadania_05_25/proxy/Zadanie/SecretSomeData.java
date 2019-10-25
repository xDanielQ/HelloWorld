package pl.sda.zadania_05_25.proxy.Zadanie;

public class SecretSomeData implements SomeData {

    @Override
    public void printData() {

    }

    public SecretSomeData(String password) {
        if (password.equals("secretpassword1234")) {
            RealSomeData realSomeData = new RealSomeData();
            realSomeData.enter();
        } else {
            System.out.println("Błędne hasło!");
        }

    }


}
