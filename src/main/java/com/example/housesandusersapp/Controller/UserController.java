package com.example.housesandusersapp.Controller;
import com.example.housesandusersapp.DTO.UserDto;
import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import com.example.housesandusersapp.rdb.DbHouseService;
import com.example.housesandusersapp.rdb.DbUserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {
    private final DbUserService dbUserService;
    public UserController(DbUserService dbUserService) {this. dbUserService= dbUserService;}

    // http://localhostL:8080/users
    @GetMapping("")
    public Iterable<User> getAll() {
        return dbUserService.getAll();
    }


    @GetMapping("{id}")
    public Optional<User> getById(@PathVariable Integer id) {
        return dbUserService.getById(id);
    }

    @PostMapping("")
    public User add(@RequestBody UserDto user) {
        return dbUserService.add(user);
    }

    @PutMapping("{id}")
    public User update(Integer id, UserDto user) {
        return dbUserService.update(id,user);
    }
    @DeleteMapping("{id}")
    public void delete(Integer id){
        dbUserService.delete(id);
    }
}
