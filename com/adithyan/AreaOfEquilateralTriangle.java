package com.adithyan;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Equilateral triangle : ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3)/(4)*side*side);
        System.out.println("Area of equilateral triangle is : "+area);
    }
}
