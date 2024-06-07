package com.adithyan;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower bond : ");
        int lower = scanner.nextInt();

        System.out.println("Enter the upper bond : ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong Numbers between "+lower+"and"+upper+"are:");
        for (int i=lower;i<=upper;i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
        scanner.close();
    }
    public static boolean isArmstrong(int num){
        int original = num,sum=0;
        int n = String.valueOf(num).length();
        while(num!=0){
            int digit = num%10;
            sum+=Math.pow(digit,n);
            num /=10;
        }
        return sum == original;
    }
}
