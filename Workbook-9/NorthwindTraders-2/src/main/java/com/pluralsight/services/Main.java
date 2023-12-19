package com.pluralsight.services;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("=============== Northwind Traders =================");
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("3. Update Products");
            System.out.println("4. Delete Product");

            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    listAllEmployees(Employee, scanner);
                    break;
                case 2:
                    addEmployee(, scanner);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
    }
}
