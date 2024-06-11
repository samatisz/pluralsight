package com.pluralsight;

import java.security.spec.ECField;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");


        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "ryUz@ki2016");
        try {


            String query = """
                    SELECT ProductID, ProductName, UnitPrice, UnitsInStock 
                    FROM products
                    """;

            PreparedStatement preparedstatement = connection.prepareStatement(query);
            ResultSet results = preparedstatement.executeQuery(query);


            while (results.next()) {
                System.out.println("。。。。。。。。。。。。。。");
                String productID = results.getString("ProductID");
                System.out.println("Product ID: " + productID);
                String productName = results.getString("ProductName");
                System.out.println("Product Name: " + productName);
                String unitPrice = results.getString("UnitPrice");
                System.out.println("Unit Price: " + unitPrice);
                String unitsInStock = results.getString("UnitsInStock");
                System.out.println("Units In Stock: " + unitsInStock);
            }

            // 3. Close the connection
            results.close();
            preparedstatement.close();
        } finally {
            connection.close();
        }
    }

    Scanner myScanner = new Scanner(System.in);


    public void displayScreen() {
        while (true) {
            int choice = myScanner.nextInt();
            System.out.println("。。。。。。。。。。。");
            System.out.println("");
            System.out.println("Welcome!");
            System.out.println("");
            System.out.println("。。。。。。。。。。。");
            System.out.println("1. Display all products");
            System.out.println("2. Display all customers");
            System.out.println("0. Exit application");
            System.out.println(" > ");

            switch(choice) {
                case 1:
                    displayAllProductsRequest();
                    break;
                case 2:
                    displayAllCustomersRequest();
                    break;
                case 0:
                    exitApplicationRequest();
                    break;
                default:
                    System.out.println("Invlaid choice, please try again!");
            }
        }
    }

    public void displayAllProductsRequest() {

    }

    public void displayAllCustomersRequest() {

    }

    public void exitApplicationRequest() {

    }
}
