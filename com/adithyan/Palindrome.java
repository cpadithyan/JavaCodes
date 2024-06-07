package com.adithyan;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String Str = scanner.nextLine();
        String reversedStr = new StringBuilder(Str).reverse().toString();

        if (Str.equals(reversedStr)){
            System.out.println(Str+" is a palindrome");
        }else{
            System.out.println(Str+" is not a palindrome");
        }
        scanner.close();
    }
}
