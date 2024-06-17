package com.adithyan;

import java.util.Scanner;

public class AvgOfNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count : ");
        int count = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Enter No : "+(i+1)+ ":");
            sum += scanner.nextInt();
        }
        double avg = (double)sum/count;
        System.out.println("The avg is : "+avg);
    }

}
