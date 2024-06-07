package com.adithyan;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Circumference" +circumference(radius));
        System.out.println("Area" +area(radius));
    }
    public static double circumference(double radius){
        return 2*Math.PI*radius;
    }
    public static double area(double radius){
        return Math.PI*radius*radius;
    }
}
