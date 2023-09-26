package com.example.housesandusersapp.rdb;

import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House,Integer> {

}
