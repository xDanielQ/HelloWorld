package pl.sda.zadania_05_25.state.customs_office;

public class DocumentSubmittedState extends ApplicationState {

    @Override
    public void updateState(Document yourDocument) {
        yourDocument.setApplicationState(new DocumentPaidState());
    }
    public void print() {
        System.out.println("Your application is submitted!");
    }
}
