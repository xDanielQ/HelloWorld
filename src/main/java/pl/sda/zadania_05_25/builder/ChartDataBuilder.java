package pl.sda.zadania_05_25.builder;

public class ChartDataBuilder {

    private int minValue = 10;
    private int maxValue = 20;
    private int lineColour = 45665;
    private int dotColor = 45453;
    private int step = 5;

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void setLineColour(int lineColour) {
        this.lineColour = lineColour;
    }

    public void setDotColor(int dotColor) {
        this.dotColor = dotColor;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public ChartData build() {
        return new ChartData(
                minValue,
                maxValue,
                lineColour,
                dotColor,
                step);
    }
}
