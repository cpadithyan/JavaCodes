package com.adithyan;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        System.out.println("Factors of "+number+" are");

        for (int i = 1; i < number; i++) {
            if (number % i ==0){
                System.out.println(i);
            }

        }
    }
}
