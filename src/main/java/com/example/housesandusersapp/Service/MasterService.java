package com.example.housesandusersapp.Service;

import com.example.housesandusersapp.DTO.UserHouseDto;
import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import com.example.housesandusersapp.Models.UserHouse;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface MasterService {
     Iterable<UserHouse> getAll();              // получить все дома
     Optional<UserHouse> getById(Integer id);
     UserHouse add(Integer idMaster, UserHouseDto userHouse, Integer id);
     UserHouse update(Integer idMaster, UserHouseDto userHouse, Integer id);//обновить целиком

     void delete(Integer idMaster, UserHouseDto userHouse, Integer id);
}
