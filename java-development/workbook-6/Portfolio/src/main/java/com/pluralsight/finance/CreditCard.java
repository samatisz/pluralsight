package com.pluralsight.finance;

public class CreditCard implements iValuable {
    private String name;
    private String accountNumber;
    private double value;

    @Override
    public double getValue() {
        return 0;
    }

    public CreditCard(String name, String accountNumber, double value) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
