package com.example.housesandusersapp.Controller;

import com.example.housesandusersapp.DTO.HouseDto;
import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.rdb.DbHouseService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("house")
public class HouseController {
    private final DbHouseService dbHouseService;
    public HouseController(DbHouseService dbHouseService) {this.dbHouseService=dbHouseService;}

    // http://localhostL:8080/house
    @GetMapping("")
    public Iterable<House> getAll() {
        return dbHouseService.getAll();
    }

    // http://localhostL:8080/house/{id}
    @GetMapping("{id}")
    public Optional<House> getById(@PathVariable Integer id) {
        return dbHouseService.getById(id);
    }

    // http://localhostL:8080/house
    @PostMapping("")
    public House add(@RequestBody HouseDto house) {
        return dbHouseService.add(house);
    }
    @PutMapping("{id}")
    public House update(@RequestBody Integer id,HouseDto house) {
        return dbHouseService.update(id,house);
    }
    @DeleteMapping("{id}")
    public void delete(Integer id){
        dbHouseService.delete(id);
    }
}
