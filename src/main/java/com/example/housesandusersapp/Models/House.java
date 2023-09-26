package com.example.housesandusersapp.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="house_t")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class House {
    // поля - соответствуют столбцам (атрибутам) БД
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="address_f", nullable = false)
    private String adress;
    @OneToOne
    @JoinColumn(name="idMaster", referencedColumnName = "id")
    private User user;

}
