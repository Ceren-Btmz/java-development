package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];
        int numVehicles = 6;

        vehicles[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println("Enter your command: ");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    listAllVehicles(vehicles, numVehicles);
                    System.out.println("You choose one");
                    break;
                case 2:
                    findVehiclesByMakeModel(vehicles, numVehicles, scanner);
                    break;
                case 3:
                    findVehiclesByColor(vehicles, numVehicles, scanner);
                    break;
                case 4:
                    findVehiclesByPrice(vehicles, numVehicles, scanner);
                    break;
                case 5:
                    numVehicles = addVehicle(vehicles, numVehicles, scanner);
                    break;
                case 6:
                    System.out.println("GoodBye!");
                    return;
            }
        }
    }

    public static int addVehicle(Vehicle[] vehicles, int numVehicles, Scanner scanner) {
        if (numVehicles == 20) {
            System.out.println("Vehicle Inventory is full");
        } else {
            System.out.println("Enter vehicle ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();

            System.out.println("Enter the make and model: ");
            String makeModel = scanner.nextLine();

            System.out.println("Enter the Color:");
            String color = scanner.nextLine();

            System.out.println("Enter odometer reading: ");
            int odometerReading = scanner.nextInt();

            System.out.println("Enter Price: ");
            float price = scanner.nextFloat();

            vehicles[numVehicles] = new Vehicle(id,makeModel, color, odometerReading, price);
            numVehicles++;

            System.out.println("Vehicle added!");
        }
        return numVehicles;
    }

    public static void listAllVehicles(Vehicle[] vehicles, int numVehicles) {
        System.out.println("Vehicle Inventory: ");

        for (int i = 0; i < numVehicles; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public static void findVehiclesByMakeModel(Vehicle[] vehicles, int numVehicles, Scanner scanner) {
        System.out.println("Enter the make and model:");
        String makeModel = scanner.nextLine();

        for (int i = 0; i < numVehicles; i++) {
            if(vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                System.out.println(vehicles[i]);
            }
        }
    }

    public static void findVehiclesByColor(Vehicle[] vehicles, int numVehicles, Scanner scanner) {
        System.out.println("Enter the Color:");
        String color = scanner.nextLine();

        for (int i = 0; i < numVehicles; i++) {
            if(vehicles[i].getColor().equalsIgnoreCase(color)) {
                System.out.println(vehicles[i]);
            }
        }
    }

    public static void findVehiclesByPrice(Vehicle[] vehicles, int numVehicles, Scanner scanner) {
        System.out.println("Enter the minimum price:");
        float minPrice = scanner.nextFloat();

        System.out.println("Enter the maximum price:");
        float maxPrice = scanner.nextFloat();

        for (int i = 0; i < numVehicles; i++) {
            if(vehicles[i].getPrice() >= minPrice && vehicles[i].getPrice() <= maxPrice) {
                System.out.println(vehicles[i]);
            }
        }
    }
}
