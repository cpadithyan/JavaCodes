package com.adithyan;
import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of Equilateral Triangle : ");
        double side = scanner.nextDouble();
        double periemeter = 3*side;
        System.out.println("Perimeter of the Equilateral Triangle is : "+periemeter);
    }
}
