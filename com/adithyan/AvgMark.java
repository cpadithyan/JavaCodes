package com.adithyan;

import java.util.Scanner;

public class AvgMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of subjects : ");
        int n = input.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter marks for each subject : ");
        for(int i = 0; i<n; i++){
            marks[i] = input.nextInt();
        }

        int sum = 0;
        for(int mark : marks){
            sum+= mark;
        }

        double average = (double) sum / n;
        System.out.printf("Average Marks : %.2f\n", average);
    }

}
