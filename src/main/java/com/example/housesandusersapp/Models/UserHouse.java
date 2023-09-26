package com.example.housesandusersapp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "house_user")
public class UserHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

    @ManyToOne
    @JoinColumn(name = "home_id")
    private House home;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}

