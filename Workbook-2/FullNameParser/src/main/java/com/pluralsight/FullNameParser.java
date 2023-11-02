package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please pick a format: First Middle Last or First Last");
        String format = scanner.nextLine();

        String operator = String.valueOf(System.in);
        String firstName, middleName, lastName;

        switch (operator) {
            case "First Middle Last":
                System.out.println("Enter First Name: ");
                firstName = scanner.nextLine();

                System.out.println("Enter Middle Name: ");
                middleName = scanner.nextLine();

                System.out.println("Enter Last Name: ");
                lastName = scanner.nextLine();

                System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName);

            case "First Last":
                System.out.println("Enter First Name: ");
                firstName = scanner.nextLine();

                System.out.println("Enter Last Name: ");
                lastName = scanner.nextLine();

                System.out.println("Full Name: " + firstName + " " + lastName);
        }
    }
}
