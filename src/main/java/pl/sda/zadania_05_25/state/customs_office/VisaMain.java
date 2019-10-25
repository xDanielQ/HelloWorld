package pl.sda.zadania_05_25.state.customs_office;

public class VisaMain {

    public static void main(String[] args) {
        Document document = new Document();
        document.printState();
        document.updateApplicationState();
        document.printState();
        document.updateApplicationState();
        document.printState();
        document.updateApplicationState();
        document.printState();
        document.updateApplicationState();
    }
}
