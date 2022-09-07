package com.MinTicCiclo_3.empresatextil.services;


import com.MinTicCiclo_3.empresatextil.entity.Transaction;
import com.MinTicCiclo_3.empresatextil.repositories.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServ {
    @Autowired
    private TransactionRepo transactionRepo;

    public List<Transaction> getAllTransactions() {

        return (List<Transaction>) this.transactionRepo.findAll();
    }

    public Transaction getTransactionById(Long idTransaction) {

        Optional<Transaction> opcionalTransaction = this.transactionRepo.findById(idTransaction);
        if (opcionalTransaction.isEmpty()) {
            return null;
        }
        return opcionalTransaction.get();
    }

    public Transaction createTransaction(Transaction newTransaction) {
        return this.transactionRepo.save(newTransaction);
    }
}
