package com.example.projectoop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name="transactions")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double amount;
    private long id;
    @ManyToOne
    @JoinColumn(name= "User", nullable = false)
    private User    user;

    @ManyToOne
    @JoinColumn(name = "balance")
    private Balance balance;

}
