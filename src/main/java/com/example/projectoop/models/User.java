package com.example.projectoop.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

}
