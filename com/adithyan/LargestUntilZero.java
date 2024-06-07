package com.adithyan;

import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int number;

        do {
            System.out.println("Enter a Number(0 to stop) : ");
            number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
        }
            while(number != 0);

            if(largest == Integer.MIN_VALUE) {
                System.out.println("No numbers were entered ");
            } else {
                System.out.println("Largest Number : " + largest);
            }
        }

    }
