package com.adithyan;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales amount : ");
        double sales = scanner.nextDouble();

        System.out.println("Enter commission : ");
        double commission = scanner.nextDouble();

        double commission1 = (commission/100)*sales;

        System.out.println("The commission : "+commission1);
    }
}
