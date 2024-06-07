package com.adithyan;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();
        double volume = (1.0/3)*Math.PI*radius*radius*height;
        System.out.println("Volume : "+volume);
    }
}
