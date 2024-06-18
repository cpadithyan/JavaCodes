package com.adithyan;

import java.util.Scanner;

public class CGPACalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no. of Subjects : ");
        int Subjects = scanner.nextInt();
        double totalGradepoints = 0;

        for (int i = 0; i < Subjects; i++) {
            System.out.println("Enter grade for subject "+(i+1)+":");
            double grade = scanner.nextDouble();
            totalGradepoints += grade;
        }
        double cgpa = totalGradepoints/Subjects;
        System.out.println("The cgpa is "+cgpa);
    }
}
