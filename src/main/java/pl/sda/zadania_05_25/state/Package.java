package pl.sda.zadania_05_25.state;

public class Package {

    private DeliveryState deliveryState = new SortingCenterState();

    public void printState() {
        deliveryState.print();
    }

    public void updatePackageState() {
        deliveryState.updateState(this);
    }

    public void setDeliveryState(DeliveryState deliveryState) {
        this.deliveryState = deliveryState;
    }
}
