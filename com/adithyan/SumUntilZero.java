package com.adithyan;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; int number;

        do {
            System.out.println("Enter numbers(0 to stop) : ");
            number = scanner.nextInt();
            sum = sum + number;
        }while(number!=0);
        System.out.println("Sum : "+sum);
        }
    }
