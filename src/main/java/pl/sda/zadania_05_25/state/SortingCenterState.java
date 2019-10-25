package pl.sda.zadania_05_25.state;

public class SortingCenterState extends DeliveryState {

    @Override
    public void updateState(Package yourPackage) {
        yourPackage.setDeliveryState(new CourierDeliveringState());
    }

    public void print() {
        System.out.println("Waiting in sorting center...");
    }
}
