package com.adithyan;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the Rectangle : ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the Rectangle : ");
        double width = scanner.nextDouble();
        double area = length*width;

        System.out.println("Area of the Rectangle : "+area);

    }
}
