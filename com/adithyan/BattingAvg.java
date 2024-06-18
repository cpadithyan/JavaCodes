package com.adithyan;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total runs scored : ");
        int runs = scanner.nextInt();

        System.out.println("Enter total no. of innings : ");
        int innings = scanner.nextInt();

        System.out.println("Enter the no. of not out innings : ");
        int notOutInnings = scanner.nextInt();

        double Avg = (double) runs/(innings-notOutInnings);
        System.out.println("The batting Avg : "+Avg);
    }
}
