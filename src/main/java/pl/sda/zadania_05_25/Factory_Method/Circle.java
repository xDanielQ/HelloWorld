package pl.sda.zadania_05_25.Factory_Method;

import java.util.Scanner;

public class Circle implements Shape{

    @Override
    public double calculateArea() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj promień koła aby wyliczyć pole:");
        double r = scaner.nextDouble();
        return Math.PI * r * r;
    }
}
