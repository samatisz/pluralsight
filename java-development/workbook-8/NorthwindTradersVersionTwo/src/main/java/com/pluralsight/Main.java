package com.pluralsight;

import java.security.spec.ECField;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        if (args.length != 2) {
            System.out.println("Application needs two arguments to run: " +
                               "java com.pluralsight.Main <username> <password>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("。。。。。。。。。。。");
            System.out.println("");
            System.out.println("Welcome!");
            System.out.println("");
            System.out.println("。。。。。。。。。。。");
            System.out.println("1. Display all products");
            System.out.println("2. Display all customers");
            System.out.println("3. Display all categories");
            System.out.println("0. Exit application");
            System.out.println("Please select an option: ");
            System.out.println(" > ");

            int choice = myScanner.nextInt();

            switch(choice) {
                case 1:
                    displayAllProductsRequest(username, password);
                    break;
                case 2:
                    displayAllCustomersRequest(username, password);
                    break;
                case 3:
                    displayAllCategoriesRequest(username, password);
                    break;
                case 0:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
        }
    }

    public static void displayAllProductsRequest(String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;
            try  {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind", username, password);

                String query = """
                        SELECT ProductID, ProductName, UnitPrice, UnitsInStock 
                        FROM products
                        """;
                preparedStatement = connection.prepareStatement(query);
                results = preparedStatement.executeQuery();

                while (results.next()) {
                    int productId = results.getInt("ProductID");
                    String productName = results.getString("ProductName");
                    double unitPrice = results.getDouble("UnitPrice");
                    int unitsInStock = results.getInt("UnitsInStock");

                    System.out.println("Product ID: " + productId);
                    System.out.println("Product Name: " + productName);
                    System.out.println("Unit Price: " + unitPrice);
                    System.out.println("Units In Stock: " + unitsInStock);
                    System.out.println("-----------------------------------------");
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

                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
        }
    }

    public static void displayAllCustomersRequest(String username, String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);

            String query = """
            SELECT ContactName, CompanyName, City, Country, Phone 
            FROM Customers 
            ORDER BY Country
            """;
            statement = connection.prepareStatement(query);
            results = statement.executeQuery();

            while (results.next()) {
                String contactName = results.getString("ContactName");
                String companyName = results.getString("CompanyName");
                String city = results.getString("City");
                String country = results.getString("Country");
                String phone = results.getString("Phone");

                System.out.println("Contact Name: " + contactName);
                System.out.println("Company Name: " + companyName);
                System.out.println("City: " + city);
                System.out.println("Country: " + country);
                System.out.println("Phone: " + phone);
                System.out.println("-----------------------------------------");
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

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void displayAllCategoriesRequest(String username, String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);

            String query = """
                               SELECT CategoryID, CompanyName 
                               FROM Categories 
                               ORDER BY CategoryID
                                    """;
            statement = connection.prepareStatement(query);
            results = statement.executeQuery();

            while (results.next()) {
                String categoryID = results.getString("CategoryID");
                String categoryName = results.getString("CategoryName");

                System.out.println("Category ID: " + categoryID);
                System.out.println("Category Name: " + categoryName);
                System.out.println("-----------------------------------------");
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

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
