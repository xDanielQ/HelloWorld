package pl.sda.zadania_05_25.state;

public class CourierDeliveringState extends DeliveryState {

    @Override
    public void updateState(Package yourPackage) {
        yourPackage.setDeliveryState(new PackageDeliveredState());
    }

    public void print() {
        System.out.println("Courier is delivering right now!");
    }
}
