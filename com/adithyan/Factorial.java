package com.adithyan;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("The factorial is "+factorial(num));
    }
    public static int factorial(int num){
        if (num == 0 || num==1) return 1;
        int result = 1;

        for(int i = 2; i<=num; i++){
            result  *= i;
        }
        return result;
    }
}
