package com.adithyan;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int num1  = scanner.nextInt();
        System.out.println("Enter 2nd Number : ");
        int num2  = scanner.nextInt();

        int sum = num1+num2;
        System.out.println("Sum : "+sum);

    }
}
