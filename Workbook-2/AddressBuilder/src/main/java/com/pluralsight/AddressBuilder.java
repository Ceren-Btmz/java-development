package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your billing address: ");

        System.out.println("Full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter billing street: ");
        String billingStreet = input.nextLine();

        System.out.println("Enter billing city: ");
        String billingCity = input.nextLine();

        System.out.println("Enter billing state: ");
        String billingState = input.nextLine();

        System.out.println("Enter billing zip: ");
        String billingZip = input.nextLine();

        System.out.println("Please enter your shipping address: ");

        System.out.println("Enter shipping street: ");
        String shippingStreet = input.nextLine();

        System.out.println("Enter shipping city: ");
        String shippingCity = input.nextLine();

        System.out.println("Enter shipping state: ");
        String shippingState = input.nextLine();

        System.out.println("Enter shipping zip: ");
        String shippingZip = input.nextLine();

        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(fullName).append("\n\n");

        addressBuilder.append("Billing Address:\n");
        addressBuilder.append(billingStreet).append("\n");
        addressBuilder.append(billingCity).append(", ");
        addressBuilder.append(billingState).append(" ");
        addressBuilder.append(billingZip).append("\n\n");

        addressBuilder.append("Shipping Address:\n");
        addressBuilder.append(shippingStreet).append("\n");
        addressBuilder.append(shippingCity).append(", ");
        addressBuilder.append(shippingState).append(" ");
        addressBuilder.append(shippingZip).append("\n\n");

        System.out.println(addressBuilder.toString());
    }
}
