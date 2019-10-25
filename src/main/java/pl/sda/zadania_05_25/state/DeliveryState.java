package pl.sda.zadania_05_25.state;

public abstract class DeliveryState {

    protected void updateState(Package yourPackage) {
        // no-op
    }

    protected abstract void print();
}
