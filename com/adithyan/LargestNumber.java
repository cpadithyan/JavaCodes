package com.adithyan;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Second Number : ");
        double num2 = scanner.nextDouble();

        if (num1>num2) {
            System.out.println(num1 + "is Largest Number");
        }
            else if (num2>num1) {
                System.out.println(num2+"is Largest Number");
            }
            else {
            System.out.println("Both Numbers are Equal");
        }
        }
    }
