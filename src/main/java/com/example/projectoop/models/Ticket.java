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
    private String name;
    private int price;
    private int id;
    private int owner;



    public String ToString() {
        return id + ". " + "Name of ticket: " + name + " price of ticket: " + price;
    }
}
