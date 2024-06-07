package com.adithyan;

import java.util.Scanner;

public class EvenOddFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is even");
        }else {
            System.out.println(num +" is odd");
        }
    }
    public static boolean isEven(int num){
        return num%2 == 0;
    }
}
