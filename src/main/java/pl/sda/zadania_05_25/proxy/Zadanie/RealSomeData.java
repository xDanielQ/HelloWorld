package pl.sda.zadania_05_25.proxy.Zadanie;

public class RealSomeData implements SomeData {


    void enter(){
        System.out.println("Udało się!");
    }

    @Override
    public void printData() {

    }
}
