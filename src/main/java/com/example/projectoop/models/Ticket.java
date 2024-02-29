package com.example.projectoop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int owner;
    private int price;



    public String ToString() {
        return id + ". " + "Name of ticket: " + name + " price of ticket: " + price;
    }
}
