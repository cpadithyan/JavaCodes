package com.adithyan;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd No");
        int num2 = sc.nextInt();

        int result = sum(num1,num2);
        System.out.println("The sum is "+result);
    }
    public static int sum(int a, int b){
        return a+b;

    }


}
