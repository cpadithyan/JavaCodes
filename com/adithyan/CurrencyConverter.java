package com.adithyan;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Amount in Rs : ");
        double rupees = scanner.nextDouble();

        double usd = rupees/83.30;
        System.out.println("Equivalent Amount in usd : "+usd);
    }
}
