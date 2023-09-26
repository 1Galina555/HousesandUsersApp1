package com.example.housesandusersapp.Service;

import com.example.housesandusersapp.DTO.HouseDto;
import com.example.housesandusersapp.Models.House;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface HouseService {
    Iterable<House> getAll();              // получить все дома
    Optional<House> getById(Integer id);   // получить дом по id
    House add(HouseDto house);//добавить дом
    House update(Integer id,HouseDto house);//обновить целиком

    void delete(Integer id);//

}
