package pl.sda.zadania_02_24;

public class Switch {
    public static void main(String[] args) {
        String color = "Red";
        switch (color){
            case "Red" :
                System.out.println("The color is red!");
                break;
            case "Green" :
                System.out.println("The color is Green!");
                break;
            default:
                System.out.println("Other color");
                break;
        }

    }
}
