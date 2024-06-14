package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    // Holds the database connection pool
    private BasicDataSource dataSource;

    //Constructor to initialize the DataManager with database connection settings
    public DataManager(String url, String username, String password) {
        dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }

    //Inserts a new shipper into the database
    public void insertShipper(String companyName, String phoneNumber) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO shippers (CompanyName, Phone) VALUES (?, ?)",
                     PreparedStatement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, companyName);  // Setting the first parameter (CompanyName) in the query
            statement.setString(2, phoneNumber);  // Setting the second parameter (Phone) in the query
            statement.executeUpdate();  // Executing the update

            // Retrieving the generated keys to fetch the new shipper ID
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int shipperId = generatedKeys.getInt(1);  // Retrieving the first column of the generated key
                    System.out.println("New Shipper ID: " + shipperId);  // Printing the new shipper ID
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handling SQL exception errors
        }
    }

    //Retrieves all shippers from the database
    public List<Shipper> getAllShippers() {

        List<Shipper> shippers = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();  // Obtaining a database connection from the pool
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM shippers");  // Creating a PreparedStatement to execute the query
             ResultSet resultSet = statement.executeQuery()) {  // Executing the query
            while (resultSet.next()) {
                int shipperId = resultSet.getInt("ShipperID");
                String companyName = resultSet.getString("CompanyName");
                String phoneNumber = resultSet.getString("Phone");
                Shipper shipper = new Shipper(shipperId, companyName, phoneNumber);
                shippers.add(shipper); // Adding new Shipper object to the list
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handling SQL exception errors
        }

        return shippers;
    }

    //Updates the phone number of a specific shipper in the database
    public void updateShipperPhoneNumber(int shipperId, String phoneNumber) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "UPDATE shippers SET Phone = ? WHERE ShipperID = ?")) {
            statement.setString(1, phoneNumber);
            statement.setInt(2, shipperId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Deletes a shipper from the database based on the shipper ID
    public void deleteShipper(int shipperId) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "DELETE FROM shippers WHERE ShipperID = ?")) {
            statement.setInt(1, shipperId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
