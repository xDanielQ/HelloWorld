package pl.sda.zadania_05_25.builder;

public class BuilderMain {

    public static void main(String[] args) {
        ChartDataBuilder builder = new ChartDataBuilder();
        ChartData data = builder.build();
        System.out.println(data);

        builder.setMaxValue(30);
        builder.setLineColour(12345);
        ChartData data1 = builder.build();
        System.out.println(data1);
    }
}
