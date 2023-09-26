package com.example.housesandusersapp.Models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_t")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="age", nullable = false)
    private Integer age;
    @Column(name="password", nullable = false)
    private String password;


}
