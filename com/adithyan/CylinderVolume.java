package com.adithyan;

import java.util.Scanner;

public class CylinderVolume {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = calculateCylinderVolume(radius, height);
        System.out.println("The volume of the cylinder is: " + volume);

        scanner.close();
    }

    public static double calculateCylinderVolume(double radius, double height) {
        final double PI = 3.14159;
        return PI * radius * radius * height;
    }
}
