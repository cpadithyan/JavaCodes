package com.adithyan;

import java.util.Scanner;

public class PyramidVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length : ");
        double length = scanner.nextDouble();
        System.out.println("Enter width : ");
        double width = scanner.nextDouble();
        System.out.println("Enter Height : ");
        double height = scanner.nextDouble();

        double volume = calculateVolume(length,width,height);
        System.out.println("The Volume : "+volume);
    }

    public static double calculateVolume(double length, double width, double height){
        return (length*width*height/3.0);
    }
}
