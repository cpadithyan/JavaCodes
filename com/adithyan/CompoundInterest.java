package com.adithyan;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principal : ");
        double principal = input.nextDouble();

        System.out.println("Enter rate of interest : ");
        double rate = input.nextDouble();

        System.out.println("Enter time in years : ");
        int time = input.nextInt();

        System.out.println("Enter number of times interest is compounded per year : ");
        int numberOfTimes = input.nextInt();

        double compoundInterest = principal * Math.pow((1+ (rate/100) / numberOfTimes), numberOfTimes*time);
        System.out.printf("Compound Interest is : %.2f\n", compoundInterest );

    }
}
