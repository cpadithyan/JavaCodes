package com.adithyan;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the Triangle : ");
        double base = scanner.nextDouble();
        System.out.println("Enter height of the Triangle : ");
        double height = scanner.nextDouble();

        double area = 0.5*base*height;
        System.out.println("Area of triangle : "+area);
    }
}
