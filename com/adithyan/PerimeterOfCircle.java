package com.adithyan;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double radius = sc.nextInt();
        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter of the circle is : "+perimeter);
    }
}
