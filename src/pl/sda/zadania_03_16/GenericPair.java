package pl.sda.zadania_03_16;

public class GenericPair<T1, T2> {
    private T1 a;
    private T2 b;


    public GenericPair(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T1 getA() {
        return a;
    }

    public T2 getB() {
        return b;
    }
}
