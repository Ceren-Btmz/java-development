package com.pluralsight;
import java.sql.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        if (args.length != 2) {
            System.out.println("Username and Password needed to run this app!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products");
            System.out.println("2) Display all customers");
            System.out.println("3) Display all categories");
            System.out.println("0) Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllProducts(username, password);
                    break;
                case 2:
                    displayAllCustomers(username, password);
                    break;
                case 3:
                    displayAllCategories(username, password);
                    break;;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        private static void displayAllProducts(String username, String password){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind", username, password);

                String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet results = statement.executeQuery();

                while (results.next()) {
                    int productId = results.getInt("ProductID");
                    String productName = results.getString("ProductName");
                    double unitPrice = results.getDouble("UnitPrice");
                    int unitsInStock = results.getInt("UnitsInStock");

                    System.out.println("Product ID: " + productId);
                    System.out.println("Product Name: " + productName);
                    System.out.println("Unit Price: " + unitPrice);
                    System.out.println("Units In Stock: " + unitsInStock);
                    System.out.println("----------------------------------------------");

                    results.close();
                    statement.close();
                    connection.close();
                }

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            } finally {
                if (results != null) {
                    try {
                        results.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (st)
            }
        }

    }
}
