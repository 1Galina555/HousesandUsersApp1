package com.example.housesandusersapp.Controller;

import com.example.housesandusersapp.DTO.UserHouseDto;
import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import com.example.housesandusersapp.Models.UserHouse;
import com.example.housesandusersapp.rdb.DbMasterService;
import com.example.housesandusersapp.rdb.DbUserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("master")
public class MasterController {
    private final DbMasterService dbMasterService;
    public MasterController(DbMasterService dbMasterService){this.dbMasterService=dbMasterService ;}
    @GetMapping("")
    public Iterable<UserHouse> getAll() {
        return dbMasterService.getAll();
    }

    @GetMapping("{id}")
    public Optional<UserHouse> getById(@PathVariable Integer id) {
        return dbMasterService.getById(id);
    }
    @PostMapping("")
    public UserHouse add(@RequestBody Integer idMaster, UserHouseDto userHouseDto, Integer idHouse) {
        return dbMasterService.add(idMaster, userHouseDto,idHouse);
    }
    @PutMapping("{id}")
    public UserHouse update(@RequestBody Integer idMaster, UserHouseDto userHouseDto, Integer idHouse) {
        return dbMasterService.update(idMaster,userHouseDto,idHouse);
    }
    @DeleteMapping("{id}")
    public void delete(@RequestBody Integer idMaster, UserHouseDto userHouse, Integer idHouse){
        dbMasterService.delete(idMaster,userHouse,idHouse);
    }
}
