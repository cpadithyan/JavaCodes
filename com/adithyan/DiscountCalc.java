package com.adithyan;

import java.util.Scanner;

public class DiscountCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the price : ");
        double OriginalPrice = scanner.nextDouble();
        
        System.out.println("Enter the discount % : ");
        double discount = scanner.nextDouble();
        
        double DiscountPrice = (discount/100)*OriginalPrice;
        double FinalPrice = OriginalPrice - DiscountPrice;
        
        System.out.println("Final discounted price is : "+FinalPrice);
        
    }
}
