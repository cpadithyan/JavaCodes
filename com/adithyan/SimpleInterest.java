package com.adithyan;

import java.util.Scanner;


public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal(p) :");
        double principal = scanner.nextDouble();

        System.out.println("Enter the time(T) :");
        double time = scanner.nextDouble();

        System.out.println("Enter the rate(R) :");
        double rate = scanner.nextDouble();

        double SimpleIntrest = (principal*time*rate)/100;

        System.out.println("SimpleInterest : " +SimpleIntrest);


    }
}
