package com.pluralsight;

public class Mathapp {
    public static void main(String[] args) {
        long bobSalary = 88_500;
        long garySalary = 90_250;
        long highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest Salary is " + highestSalary);

        int carPrice = 48_008;
        int truckPrice = 38_372;
        int lowestCost = Math.min(carPrice, truckPrice);
        System.out.println("The lowest costing vehicle is " + lowestCost);

        double pi = 3.14, r = 7.25, area;
        area = pi * r * r;
        System.out.println("The area of the circle is " + area);

        double variable = 5;
        double sqrtResult;
        double SqrtResult = Math.sqrt(variable);
        System.out.println("The square root of variable 5 is " + SqrtResult);

        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is " + distance);

        double num1 = -3.8;
        double absNum1 = Math.abs(num1);
        System.out.println("The absolute value of -3.8 is " + absNum1);

        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);

    }
}
