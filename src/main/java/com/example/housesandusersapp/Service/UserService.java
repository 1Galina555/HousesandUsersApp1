package com.example.housesandusersapp.Service;

import com.example.housesandusersapp.DTO.UserDto;
import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    Iterable<User> getAll();              // получить всех жителей
    Optional<User> getById(Integer id);   // получить жителей по id
    User add(UserDto user);//добавить пользователей
   User update( Integer id,  UserDto user);//обновить целиком

    void delete(Integer id);//удалять жильца
}
