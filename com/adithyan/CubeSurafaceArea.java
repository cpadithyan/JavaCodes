package com.adithyan;

import java.util.Scanner;

public class CubeSurafaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length : ");
        double sideLength = scanner.nextDouble();

        double area = surfaceArea(sideLength);
        System.out.println("Area "+area);

        scanner.close();
    }
    public static double surfaceArea(double sideLength){
        return 6*Math.pow(sideLength,2);
    }
}
