package pl.sda.zadania_05_25.Singleton;

public class Logger {

    private final static Logger INSTANCE = new Logger();
    private int counter;

    public static Logger getInstance() {
        return INSTANCE;
    }

    public Logger() {
        System.out.println("Logger created");
//        counter++;
    }


    public void log (String message){

        System.out.println(message);

    }
}
