package com.adithyan;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st no : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd no : ");
        int num2 = scanner.nextInt();

        int result = product(num1,num2);
        System.out.println("Product is : "+result);
    }

    public static int product(int a, int b) {
        return a * b;
    }
}
