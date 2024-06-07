package com.adithyan;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter side length of Rhombus : ");
        double side = scanner.nextDouble();

        double perimeter = 4*side;
        System.out.println("Perimeter of Rhombus : "+perimeter);
    }
}
