package com.pluralsight;

import java.util.Scanner;
public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);
        int age = getAge(scanner);

        printMessage(name, age);

        printVotingEligibility(age);

        printWelcomeMessage(name);

        printDrinkingEligibility(name, age);

        double number = getNumber(scanner);

        double squareRoot = findSqrt(number);

        System.out.println("The square root of " + number + "is " + squareRoot);

        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);

        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber+ " is greater than " + secondNumber + ": " + isGreaterThan);

        String welcomeMessage = name.equalsIgnoreCase("Eve") ? "You are not welcome!" : "You are welcome";
        System.out.println(welcomeMessage);

        double num1 = 5.6;
        double num2 = 3.2;
        double maxNum = maximumValue(num1,num2);

        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + maxNum);

    }

    public static double maximumValue(double num1,double num2) {
        return Math.max(num1,num2);
    }

    public static boolean isGreaterThan(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;
    }
    public static double findSqrt(double number) {
        double root = Math.sqrt(number);
        return root;
    }

    public static void printDrinkingEligibility(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("You are old enough to drink.");
        } else {
            System.out.println("You are not old enough to drink.");
        }
    }

    public static void printWelcomeMessage(String name) {
        switch (name.toLowerCase()) {
            case "Alice":
                System.out.println("Welcome, Alice!");
                break;
            case "Bob":
                System.out.println("Hey Bob, would you like to grab a drink?");
                break;
            default:
                System.out.println("Hello, stranger!");
                break;
        }
    }

    public static void printMessage(String name, int age) {
        System.out.println("Hello " + name + "! You are "
                + age + " years old." );
    }

    public static String getName(Scanner scanner) {
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    public static int getAge(Scanner scanner) {
        System.out.println("Enter you age: ");
        return scanner.nextInt();
    }

    public static double getNumber(Scanner scanner) {
        System.out.println("The square root of ");
        return scanner.nextDouble();
    }

    public static int getFirstNumber(Scanner scanner) {
        System.out.println("Enter the first number: ");
        return scanner.nextInt();
    }

    public static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter the Second number: ");
        return scanner.nextInt();
    }
    public static void printVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }
}
