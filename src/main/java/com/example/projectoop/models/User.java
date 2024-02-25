package com.example.projectoop.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private boolean typeofaccount;
    public String ToString(){
        return "id:" + id + "\nUsername: " + login + "\ntype of account: " + (typeofaccount? "Prodavets" : "Pokupatel");
    }
}
