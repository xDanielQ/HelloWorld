package pl.sda.zadania_05_25.Singleton;

public class LoggerMain {
    public static void main(String[] args) {
        Logger counter1 = Logger.getInstance();
        Logger counter2 = Logger.getInstance();

        counter1.log("Bla bla");
        counter1.log("fasfa");
    }



}
