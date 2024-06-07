package com.adithyan;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length : ");
        double length = scanner.nextDouble();
        System.out.println("Enter width : ");
        double width = scanner.nextDouble();

        double perimeter = 2*(length+width);
        System.out.println("Perimeter is "+perimeter);
    }
}
