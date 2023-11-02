package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();

        System.out.println("\nPossible calculations: ");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubtract");
        System.out.println(" (M)ultiply");
        System.out.println(" (D)ivide");
        System.out.println("Select an option: ");
        char operation = Character.toUpperCase(input.next().charAt(0));

        if (operation == 'A') {
            double result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (operation == 'S') {
            double result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (operation == 'M') {
            double result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (operation == 'D') {
            if (num2 != 0) {
                double result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operation.");
        }
    }
}