package com.pluralsight.ledger.models;
//second class to set up

public class Transaction {
    private int transactionId;
    private double amount;
    private String vendor;

    public Transaction(int transactionId, double amount, String vendor) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.vendor = vendor;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getVendor() {
        return vendor;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
