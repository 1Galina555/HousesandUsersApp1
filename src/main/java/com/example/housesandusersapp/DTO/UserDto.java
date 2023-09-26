package com.example.housesandusersapp.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDto {
    private String name;
    private Integer age;
    private String password;
}
