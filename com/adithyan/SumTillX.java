package com.adithyan;

import java.util.Scanner;

public class SumTillX{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        char number;

        do {
            System.out.print("Enter a number (or 'x' to stop): ");
            number = scanner.next().charAt(0);

            if (number != 'x') {
                int num = Character.getNumericValue(number);  // Convert char to int
                sum += num;
            }
        } while (number != 'x');

        System.out.println("The sum of all numbers entered is: " + sum);
        scanner.close();
    }
}
