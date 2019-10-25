package pl.sda.zadania_05_25.Singleton;

public class CounterSingleton {

    private final static CounterSingleton INSTANCE = new CounterSingleton();

    public static CounterSingleton getInstance() {
        return INSTANCE;
    }

    private CounterSingleton() {
        // no-op
    }

    private int counter;

    public void increment() {
        counter++;
    }

    public void printCounter() {

        System.out.println("value = " + counter);
    }
}
