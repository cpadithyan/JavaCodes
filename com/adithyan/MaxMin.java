package com.adithyan;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number : ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Maximum : "+findMax(num1, num2, num3));
        System.out.println("Minimum : "+findMini(num1, num2, num3));
    }
    public static int findMax(int a, int b, int c){
        int max = a;
        if (b>max) max = b;
        if(c>max) max = c;

        return max;
    }

    public static int findMini(int a, int b, int c){
        int mini = a;
        if (b<mini) mini = b;
        if(c<mini) mini = c;

        return mini;
    }
}
