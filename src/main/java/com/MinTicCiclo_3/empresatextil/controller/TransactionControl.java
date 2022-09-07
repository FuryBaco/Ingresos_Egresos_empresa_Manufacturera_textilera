package com.MinTicCiclo_3.empresatextil.controller;

import com.MinTicCiclo_3.empresatextil.entity.Transaction;
import com.MinTicCiclo_3.empresatextil.services.TransactionServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/transaction/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionServ.deleteTransaction(id);
    }

    @PutMapping("/transaction")
    public Transaction updateTransaction(@RequestBody Transaction transaction) {
        return transactionServ.createTransaction(transaction);
    }

    @GetMapping("/transaction/{id}")
    public Transaction getTransactionById(@PathVariable Long id) {
        return transactionServ.getTransactionById(id);
    }

    @PatchMapping("/transaction/{id}")
    public Transaction updateTransaction(@PathVariable Long id, @RequestBody Transaction transaction) {
        return transactionServ.createTransaction(transaction);
    }

}
