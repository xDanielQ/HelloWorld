package pl.sda.zadania_05_25.Factory_Method;


import java.util.Scanner;

public class Triangle implements Shape {
    @Override
    public double calculateArea() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj podstawę trójkąta aby wyliczyć pole:");
        double a = scaner.nextInt();

        System.out.println("Podaj wysokość trójkąta aby wyliczyć pole:");
        double h = scaner.nextInt();
        return 0.5 * a * h;
    }
}
