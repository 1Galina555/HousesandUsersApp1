package com.example.housesandusersapp.rdb;

import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import com.example.housesandusersapp.Models.UserHouse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbMasterRepository extends CrudRepository <UserHouse, Integer> {
}
