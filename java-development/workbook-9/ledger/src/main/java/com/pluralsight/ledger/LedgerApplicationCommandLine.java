package com.pluralsight.ledger;


import com.pluralsight.ledger.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LedgerApplicationCommandLine implements CommandLineRunner {

    @Autowired //injection
    private TransactionService transactionService;


    @Override
    public void run(String... args) throws Exception {

    }
}
