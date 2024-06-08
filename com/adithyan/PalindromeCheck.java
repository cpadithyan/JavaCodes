package com.adithyan;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scanner.nextInt();

        if (isPalindrome(num)){
            System.out.println(num+" is palindrome");
        }else{
            System.out.println(num+"is not a palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int reversedNum = 0;
        while (num!=0){
            int digit = num%10;
            reversedNum = reversedNum*10+digit;
            num/= 10;
        }
        return originalNum == reversedNum;
    }
}
