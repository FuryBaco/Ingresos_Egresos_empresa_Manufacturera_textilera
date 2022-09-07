package com.MinTicCiclo_3.empresatextil.controller;

import com.MinTicCiclo_3.empresatextil.entity.Transaction;
import com.MinTicCiclo_3.empresatextil.services.TransactionServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionControl {
    @Autowired
    private TransactionServ transactionServ;

    @GetMapping("/transaction")
    public List<Transaction> getTransactionById() {

        return transactionServ.getAllTransactions();
    }

    @PostMapping("/transaction")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionServ.createTransaction(transaction);
    }

}
