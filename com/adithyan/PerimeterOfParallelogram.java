package com.adithyan;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base : ");
        double base = scanner.nextDouble();
        System.out.println("Enter the length : ");
        double length = scanner.nextDouble();

        double perimeter = 2*(base+length);
        System.out.println("Perimeter of the parallelogram is : "+perimeter);
    }
}
