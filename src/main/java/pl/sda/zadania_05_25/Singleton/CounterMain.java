package pl.sda.zadania_05_25.Singleton;

public class CounterMain {

    public static void main(String[] args) {
        CounterSingleton counter1 = CounterSingleton.getInstance();
        CounterSingleton counter2 = CounterSingleton.getInstance();

        counter1.increment();
        counter2.increment();

        counter1.printCounter();
        counter2.printCounter();
    }
}
