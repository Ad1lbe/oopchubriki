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


}
