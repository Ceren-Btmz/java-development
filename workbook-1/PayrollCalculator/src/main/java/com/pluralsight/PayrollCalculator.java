package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("How many hours have you worked? ");
        Double hours = scanner.nextDouble();

        System.out.println("What is your pay rate? ");
        Double payRate  = scanner.nextDouble();
        Double x = hours * payRate;

        System.out.println("Name: " + name);
        System.out.println("Your gross pay is " + x);
    }
}
