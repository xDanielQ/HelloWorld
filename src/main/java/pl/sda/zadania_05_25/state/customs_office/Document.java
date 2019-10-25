package pl.sda.zadania_05_25.state.customs_office;

public class Document {
    private ApplicationState applicationState = new DocumentSubmittedState();

    public void printState() {
        applicationState.print();
    }

    public void updateApplicationState() {
        applicationState.updateState(this);
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }
}
