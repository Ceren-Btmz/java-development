package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Enter middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Enter last name: ");
        String lastname = scanner.nextLine().trim();

        System.out.println("Enter suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName.charAt(0) + ".";
        }

        fullName += " " + lastname;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("\nFull Name: " + fullName);
    }
}
