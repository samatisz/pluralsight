package com.pluralsight.ledger.dao.impl;

import com.pluralsight.ledger.dao.interfaces.ITransactionDAO;
import com.pluralsight.ledger.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component //makes it a spring bean
public class JDBCTransactionDAO implements ITransactionDAO {

    private DataSource dataSource;

    @Autowired //adding autowired is how you inject it into the class
    public JDBCTransactionDAO(DataSource dataSource) {
        this.dataSource = dataSource;
        initialize(); //put it in constructor to make it work - call it
    }

    //this is a bonus - initialize the database (if it isn't already)
    //private because it will only be used in this class
    private void initialize() {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement createTableStatement = connection.prepareStatement(
                     //create table if it is not there
                     """
                             CREATE TABLE IF NOT EXISTS transactions (
                             transaction_id int PRIMARY KEY,
                             amount decimal(10,2) NOT NULL,
                             vendor varchar(250) NOT NULL
                             );
                             """
             )) {
            createTableStatement.execute();

            //run query to find count - check to see how much data in table
            String countQuery = "SELECT COUNT(*) AS rowCount FROM transactions";
            //this will count all rows from transaction table

            try (PreparedStatement countStatement = connection.prepareStatement(countQuery);
                 ResultSet resultSet = countStatement.executeQuery()) {
                if (resultSet.next() && resultSet.getInt("rowCount") == 0) {

                    String insertDataQuery = "INSERT INTO transactions (transaction_id, amount, vendor) VALUES (?, ?, ?)";

                    try (PreparedStatement insertDataStatement = connection.prepareStatement(insertDataQuery)) {
                        insertDataStatement.setInt(1, 1);
                        insertDataStatement.setDouble(2, 2000.00);
                        insertDataStatement.setString(3, "Matz Magnolia Shop");
                        insertDataStatement.executeUpdate();

                        insertDataStatement.setInt(1, 2);
                        insertDataStatement.setDouble(2, 600.00);
                        insertDataStatement.setString(3, "JL Tran Train Shop");
                        insertDataStatement.executeUpdate();

                        insertDataStatement.setInt(1, 3);
                        insertDataStatement.setDouble(2, 4.00);
                        insertDataStatement.setString(3, "Jackie's Jam");
                        insertDataStatement.executeUpdate();

                    }

                }
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


    @Override
    public void addTransaction(Transaction transaction) {
        String insertDataQuery = "INSERT INTO transactions (transaction_id, amount, vendor) VALUES (?, ?, ?)";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement insertStatement = connection.prepareStatement(insertDataQuery)) {
            insertStatement.setInt(1, transaction.getTransactionId());
            insertStatement.setDouble(2, transaction.getAmount());
            insertStatement.setString(3, transaction.getVendor());
            insertStatement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Transaction> getAllTransactions() {
        List<Transaction> transactions = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM transactions");
             ResultSet resultSet = selectStatement.executeQuery()) {
            while (resultSet.next()) {
                int transactionId = resultSet.getInt("transaction_id");
                double amount = resultSet.getDouble("amount");
                String vendor = resultSet.getString("vendor");

                transactions.add(new Transaction(transactionId, amount, vendor));
            }


        } catch (Exception ex) {
            ex.printStackTrace();

        }

        return transactions;

    }

    @Override
    public Transaction getTransactionById(int transactionId) {
        Transaction transaction = null;

        try(Connection connection = dataSource.getConnection();
            PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM transactions WHERE transaction_id = ?")) {

            selectStatement.setInt(1, transactionId);

            try(ResultSet resultSet = selectStatement.executeQuery()) {
                if(resultSet.next()) {
                    //don't need to get id, already there
                    double amount = resultSet.getDouble("amount");
                    String vendor = resultSet.getString("vendor");

                    transaction = new Transaction(transactionId, amount, vendor);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return transaction;
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        String updateDataQuery = "UPDATE transactions SET amount = ?, vendor = ?, WHERE transaction_id = ?";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement updateStatement = connection.prepareStatement(updateDataQuery)) {
            updateStatement.setDouble(1, transaction.getAmount());
            updateStatement.setString(2, transaction.getVendor());
            updateStatement.setInt(3, transaction.getTransactionId());


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void deleteTransaction(Transaction transaction) {
        String deleteDataQuery = "DELETE FROM transactions WHERE transaction_id = ?";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement deleteStatement = connection.prepareStatement(deleteDataQuery)) {

            deleteStatement.setInt(1, transaction.getTransactionId());
            deleteStatement.executeUpdate();

        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
