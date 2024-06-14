package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define database connection details using JDBC URL format - using northwind database
        String url = "jdbc:mysql://localhost:3306/northwind";
        // Retrieve username from command line arguments
        String username = args[0];
        // Retrieve password from command line arguments
        String password = args[1];

        // Create an instance of DataManager to handle database operations
        DataManager dataManager = new DataManager(url, username, password);

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for new shipper data
        System.out.print("Enter the shipper's name: ");
        String companyName = scanner.nextLine();
        System.out.print("Enter the shipper's phone number: ");
        String phoneNumber = scanner.nextLine();


        // Use DataManager to insert new shipper data into the database
        dataManager.insertShipper(companyName, phoneNumber);

        // Fetch all shippers' data and display it
        System.out.println("\nAll Shippers:");
        List<Shipper> shippers = dataManager.getAllShippers();
        for (Shipper shipper : shippers) {
            System.out.println("Shipper ID: " + shipper.getShipperId());
            System.out.println("Company Name: " + shipper.getCompanyName());
            System.out.println("Phone Number: " + shipper.getPhoneNumber());
            System.out.println();
        }

        // Prompt the user to change the phone number of a shipper
        System.out.print("Enter the shipper ID to update the phone number: ");
        int shipperId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the new phone number: ");
        phoneNumber = scanner.nextLine();

        // Update the specific shipper's phone number in the database
        dataManager.updateShipperPhoneNumber(shipperId, phoneNumber);

        // Fetch and display all updated shippers' data
        System.out.println("\nAll Shippers after update:");
        shippers = dataManager.getAllShippers();
        for (Shipper shipper : shippers) {
            System.out.println("Shipper ID: " + shipper.getShipperId());
            System.out.println("Company Name: " + shipper.getCompanyName());
            System.out.println("Phone Number: " + shipper.getPhoneNumber());
            System.out.println();
        }

        // Prompt the user to delete a shipper
        System.out.print("Enter the shipper ID to delete: ");
        shipperId = scanner.nextInt();

        // Delete the specified shipper from the database
        dataManager.deleteShipper(shipperId);

        // Fetch and display all remaining shippers' data after deletion
        System.out.println("\nAll Shippers after deletion:");
        shippers = dataManager.getAllShippers();
        for (Shipper shipper : shippers) {
            System.out.println("Shipper ID: " + shipper.getShipperId());
            System.out.println("Company Name: " + shipper.getCompanyName());
            System.out.println("Phone Number: " + shipper.getPhoneNumber());
            System.out.println();
        }

        scanner.close();
    }
}
