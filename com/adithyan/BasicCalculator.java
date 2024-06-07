package com.adithyan;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Second Number : ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an Operator(+,-,*,/) : ");
        char operator = scanner.next().charAt(0);
        double result;

        if(operator=='+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1*num2;
        } else if (operator == '/') {
            result = num1/num2;
        }else{
            System.out.println("Invalid Operator");
            return;
    }
        System.out.println("Result : "+result);
    }
}
