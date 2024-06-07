package com.adithyan;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base : ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();

        double area = base*height;
        System.out.println("Area of Parallelogram : "+area);
    }
}
