package com.adithyan;

import java.util.Scanner;

public class AreaOfIsoclessTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of Isosceles Triangle : ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the Isosceles Triangle : ");
        double height = scanner.nextDouble();

        double area = 0.5*base*height;
        System.out.println("Area of Isosceles Triangle : "+area);
    }
}
