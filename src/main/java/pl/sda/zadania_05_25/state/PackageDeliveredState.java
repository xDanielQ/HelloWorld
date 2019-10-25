package pl.sda.zadania_05_25.state;

public class PackageDeliveredState extends DeliveryState {

    public void print() {
        System.out.println("Package delivered. Another satisfied customer!");
    }
}
