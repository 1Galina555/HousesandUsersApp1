package com.example.housesandusersapp.DTO;

import com.example.housesandusersapp.Models.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class HouseDto {

    private String adress;
    private User user;

}
