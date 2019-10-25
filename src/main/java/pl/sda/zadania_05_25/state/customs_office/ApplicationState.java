package pl.sda.zadania_05_25.state.customs_office;

public abstract class ApplicationState {


    protected void updateState(Document yourDocument) {
        // no-op
    }

    protected abstract void print();
}
