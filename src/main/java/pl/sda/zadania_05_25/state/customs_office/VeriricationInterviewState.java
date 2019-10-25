package pl.sda.zadania_05_25.state.customs_office;

public class VeriricationInterviewState extends ApplicationState{
    @Override
    public void updateState(Document yourDocument) {
        yourDocument.setApplicationState(new VisaReceivedState());
    }
    public void print() {
        System.out.println("Interview passed! Receive Your Visa!");
    }
}
