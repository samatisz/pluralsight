package com.pluralsight.ledger.dao.interfaces;

import com.pluralsight.ledger.models.Transaction;

import java.util.List;

public interface ITransactionDAO {
    void addTransaction(Transaction transaction);

    List<Transaction> getAllTransactions();

    Transaction getTransactionById(int transactionId);

    void updateTransaction(Transaction transaction);

    void deleteTransaction(Transaction transaction);

}
