package com.adithyan;

import java.util.Scanner;

public class PowerCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base : ");
        int base = scanner.nextInt();

        System.out.println("Enter the exponent : ");
        int exponent = scanner.nextInt();

        long power = 1;
        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }
        System.out.println("Power is " + power);
    }
}
