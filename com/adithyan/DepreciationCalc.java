package com.adithyan;

import java.util.Scanner;

public class DepreciationCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter original Value : ");
        double original = scanner.nextDouble();

        System.out.println("Enter depreciation value : ");
        double depreciation = scanner.nextDouble();

        System.out.println("Enter no .of years : ");
        int years = scanner.nextInt();

        double depreciationValue = original*Math.pow(1-depreciation/100, years);
        System.out.println("Value : "+depreciationValue);
    }
}
