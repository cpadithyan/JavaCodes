package com.adithyan;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = scanner.nextLine();
        System.out.println(" Hello Mister," +name);

    }
}
