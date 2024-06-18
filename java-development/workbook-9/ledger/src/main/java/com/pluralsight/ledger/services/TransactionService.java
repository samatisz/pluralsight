package com.pluralsight.ledger.services;

import com.pluralsight.ledger.dao.interfaces.ITransactionDAO;
import com.pluralsight.ledger.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // spring bean creation
public class TransactionService {
    private ITransactionDAO transactionDAO;

    @Autowired //injected dao to use it here
    TransactionService(ITransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    public void addTransaction(Transaction transaction) {
        transactionDAO.addTransaction(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionDAO.getAllTransactions();
    }

    public Transaction getTransactionById(int transactionId) {
        return transactionDAO.getTransactionById(transactionId);
    }

    public void updateTransaction(Transaction transaction) {
        transactionDAO.updateTransaction(transaction);
    }

    public void deleteTransaction(Transaction transaction){
        transactionDAO.deleteTransaction(transaction);
    }
}
