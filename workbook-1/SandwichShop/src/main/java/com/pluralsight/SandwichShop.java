package com.pluralsight;

import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What sandwich size would you prefer regular or large? ");
        String sandwichSize = scanner.nextLine();

        double basePrice;
        if (sandwichSize == regular) {
            basePrice = 5.45;
        } else if (sandwichSize == large) {
            basePrice = 8.95;
        }

        System.out.print("What is your age? ");
        Double age = scanner.nextDouble();

        Double discountPercentage = 0.0;
        if (age <= 17) {
            discountPercentage = 0.1;
        } else if (age >= 65) {
            discountPercentage = 0.2;
        }

        double finalPrice = basePrice * (1 - discountPercentage);

        System.out.println("Cost of sandwich is " + finalPrice);

        scanner.close();
    }
}