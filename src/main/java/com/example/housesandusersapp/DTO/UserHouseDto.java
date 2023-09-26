package com.example.housesandusersapp.DTO;

import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class UserHouseDto {

    private House home;
    private User user;
}
