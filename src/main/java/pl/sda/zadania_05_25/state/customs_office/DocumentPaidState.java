package pl.sda.zadania_05_25.state.customs_office;

public class DocumentPaidState extends ApplicationState{
    @Override
    public void updateState(Document yourDocument) {
        yourDocument.setApplicationState(new VeriricationInterviewState());
    }
    public void print() {
        System.out.println("Document paid! Wait for interviev...");
    }
}
