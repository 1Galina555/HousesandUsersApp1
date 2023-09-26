package com.example.housesandusersapp.rdb;

import com.example.housesandusersapp.DTO.UserHouseDto;
import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import com.example.housesandusersapp.Models.UserHouse;
import com.example.housesandusersapp.Service.MasterService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

@Service
public class DbMasterService implements MasterService {
    private final DbMasterRepository dbMasterRepository;

    public DbMasterService(DbMasterRepository dbMasterRepository) {
        this.dbMasterRepository = dbMasterRepository;


    }

    @Override
    public Iterable<UserHouse> getAll() {
        return dbMasterRepository.findAll();
    }

    @Override
    public Optional<UserHouse> getById(Integer id) {
        return dbMasterRepository.findById(id);
    }

    @Override
    public UserHouse add(Integer idMaster, UserHouseDto userHouseDto, Integer id) {
        if (Objects.equals(userHouseDto.getHome().getId(), id) && Objects.equals(userHouseDto.getHome().getUser().getId(), idMaster)) {
            UserHouse userHouse=new UserHouse();
            userHouse.setHome(userHouseDto.getHome());
            userHouse.setUser(userHouseDto.getUser());
            return dbMasterRepository.save(userHouse);
        }
        return null;
    }

    @Override
    public UserHouse update(Integer idMaster, UserHouseDto userHouseDto, Integer id) {
        if (Objects.equals(userHouseDto.getHome().getId(), id) && Objects.equals(userHouseDto.getHome().getUser().getId(), idMaster)) {
            UserHouse user1 = dbMasterRepository.findById(id)
                    .orElseThrow(() -> new NoSuchElementException(
                            String.format("Post with id %s doesn't exist!", id)));

            user1.setUser(userHouseDto.getUser());
            user1.setHome(userHouseDto.getHome());
            return dbMasterRepository.save(user1);
        }
        return null;
    }


    @Override
    public void delete(Integer idMaster, UserHouseDto userHouseDto, Integer id) {
        if (Objects.equals(userHouseDto.getHome().getId(), id) && Objects.equals(userHouseDto.getHome().getUser().getId(), idMaster)) {
            UserHouse user1 = dbMasterRepository.findById(id)
                    .orElseThrow(() -> new NoSuchElementException(
                            String.format("Post with id %s doesn't exist!", id)
                    ));
            dbMasterRepository.delete(user1);
        }

    }
}