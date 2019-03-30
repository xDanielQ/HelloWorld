package pl.sda.Pd.Zjazd3;

public class House extends Room{
    private String address;
    private String kitchen;
    private String bathroom;
    private String rooms[] =  {"sypialnia", "salon", "pokoj"};

    public House(double height, double area, String kitchen, String bathroom) {
        super(height, area);
        this.kitchen = kitchen;
        this.bathroom = bathroom;
    }

    public House(double height, double area) {
        super(height, area);
    }

//    public double getArea(){return ;}

}

