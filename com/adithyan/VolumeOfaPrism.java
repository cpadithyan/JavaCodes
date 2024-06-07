package com.adithyan;

import java.util.Scanner;

public class VolumeOfaPrism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base : ");
        double base = scanner.nextDouble();
        System.out.println("Enter height : ");
        double height = scanner.nextDouble();

        double volume = base*height;
        System.out.println("Volume : "+volume);

    }
}
