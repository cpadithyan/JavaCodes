package com.adithyan;

import java.util.Scanner;

public class CylinderArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double area = curvedSurface(radius, height);
        System.out.println("Curved Surface Area: " + area);


        scanner.close();
    }

    public static double curvedSurface(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }
}
