package com.pluralsight;

import javax.naming.Name;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the Country code to select a City.");
        System.out.println("> ");
        String countryCode = myScanner.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver"); //error without try/catch or exception

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world",
                    "root",
                    "ryUz@ki2016"
            );

            String query = "SELECT Name FROM city WHERE countryCode = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, countryCode);
            //1 = "?"

        ResultSet results = preparedStatement.executeQuery(query);

            while(results.next()) {
                String city = results.getString("Name");
                System.out.println(city);
            }

            connection.close();


    }
}
