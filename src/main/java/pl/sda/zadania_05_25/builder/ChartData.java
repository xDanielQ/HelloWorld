package pl.sda.zadania_05_25.builder;

public class ChartData {

    private final int minValue;
    private final int maxValue;
    private final int lineColour;
    private final int dotColor;
    private final int step;

    public ChartData(int minValue, int maxValue, int lineColour, int dotColor, int step) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.lineColour = lineColour;
        this.dotColor = dotColor;
        this.step = step;
    }

    @Override
    public String toString() {
        return "ChartData{" +
                "minValue=" + minValue +
                ", maxValue=" + maxValue +
                ", lineColour=" + lineColour +
                ", dotColor=" + dotColor +
                ", step=" + step +
                '}';
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getLineColour() {
        return lineColour;
    }

    public int getDotColor() {
        return dotColor;
    }

    public int getStep() {
        return step;
    }
}
