package com.adithyan;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks(out of 100): ");
        int marks = scanner.nextInt();
        System.out.println("your grade is "+calculatorGrade(marks));
    }
    public static String calculatorGrade(int marks) {
        if (marks >= 91) return "AA";
        else if (marks>=81) return "AB";
        else if (marks>=71) return "BB";
        else if (marks>=61) return "BC";
        else if (marks>=51) return "CD";
        else if (marks>=41) return "DD";
        else return "Fail";
    }
}
