package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");


        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "ryUz@ki2016");


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
        connection.close();


    }
}