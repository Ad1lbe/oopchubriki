package com.example.projectoop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="balance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Balance {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private double balance;


@ManyToOne
@JoinColumn(name = "user_id", nullable = false)
private User user;
}
