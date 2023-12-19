package com.pluralsight;

import com.pluralsight.dp.DataManager;
import com.pluralsight.models.Shipper;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("User and Password are requires to access the database");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        DataManager dataManager = new DataManager(basicDataSource);

        List<Shipper> shippersList = dataManager.getAllShippers();

        for (Shipper shipper : shippersList) {
            printShipper(shipper);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Shippers ID: ");
        int shipperID = scanner.nextInt();

        Shipper shipper = dataManager.getShipperByID(shipperID);

        printShipper(shipper);
    }

    public static void printShipper(Shipper shipper) {
        System.out.println("Shipper ID: " + shipper.getShipperID());
        System.out.println("Company Name: " + shipper.getCompanyName());
        System.out.println("Phone: " + shipper.getPhone());
        System.out.println("======================================================");
    }
}
