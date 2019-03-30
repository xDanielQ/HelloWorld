package pl.sda.Pd.Zjazd3;

public class Room {
    private double height;
    private double area;

    public Room(double height, double area) {
        this.height = height;
        this.area = area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
