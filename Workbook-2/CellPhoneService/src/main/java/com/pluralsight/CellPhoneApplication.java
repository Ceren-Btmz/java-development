package com.pluralsight;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        phone1.setSerialNumber(serialNumber);

        System.out.println("What is the model of the phone? ");
        String model = scanner.nextLine();
        phone1.setModel(model);

        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();
        phone1.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        phone1.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        phone1.setOwner(owner);

        scanner.close();

        CellPhone phone3 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        display(phone1);
        display(phone2);
        display(phone3);

        phone1.dial(phone1.getPhoneNumber());
        phone2.dial(phone2.getPhoneNumber());
        phone1.dial(phone3);
    }

    public static void display(CellPhone phone) {
        System.out.println("\nCellPhone Details: ");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }

}
