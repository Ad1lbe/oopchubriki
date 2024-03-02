package com.example.projectoop.repositories;

import com.example.projectoop.models.Transaction;
import com.example.projectoop.models.User;
import org.springframework.stereotype.Repository;
import com.example.projectoop.models.Balance;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
List<Transaction> findByUser(User user);
List<Transaction> findByUserAndTransaction(User user, Transaction transaction);

}
