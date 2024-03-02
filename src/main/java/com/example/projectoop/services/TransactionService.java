package com.example.projectoop.services;

import com.example.projectoop.models.Transaction;
import com.example.projectoop.repositories.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service

public class TransactionService {
private final TransactionRepository transactionRepository;

public TransactionService(TransactionRepository transactionRepository){
    this.transactionRepository = transactionRepository;
}

public void addTransaction(Transaction transaction){
    transactionRepository.save(transaction);
}
    public void deleteTransaction(Long id){
        Optional<Transaction> transactionOptional=   transactionRepository.findById(id);
        if (transactionOptional.isPresent()){
            transactionRepository.delete(transactionOptional.get());
        }
        else {
            throw new IllegalArgumentException("There are no id like that");
        }
    }




}
