package pl.sda.zadania_05_25.Factory_Method;

import java.util.Scanner;

public class Square implements Shape {
    @Override
    public double calculateArea() {
        System.out.println("Podaj wartość boku aby wyliczyć pole:");
        Scanner scaner = new Scanner(System.in);
        double a = scaner.nextDouble();
        return a*a;
    }
}
