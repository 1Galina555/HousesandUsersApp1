package com.example.housesandusersapp.rdb;

import com.example.housesandusersapp.DTO.HouseDto;
import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import com.example.housesandusersapp.Service.HouseService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class DbHouseService implements HouseService {
    private final HouseRepository houseRepository;

    public DbHouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public Iterable<House> getAll() {
        return houseRepository.findAll();
    }

    @Override
    public Optional<House> getById(Integer id) {
        return houseRepository.findById(id);
    }

    @Override
    public House add(HouseDto houseDto) {
        House house=new House();
        house.setAdress(houseDto.getAdress());
        house.setUser(houseDto.getUser());
        return houseRepository.save(house);
    }

    @Override
    public House update(Integer id, HouseDto houseDto) {
        House house1 = houseRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(
                        String.format("Post with id %s doesn't exist!", id)
                ));

        house1.setAdress(houseDto.getAdress());
        house1.setUser(houseDto.getUser());
        return houseRepository.save(house1);
    }

    @Override
    public void delete(Integer id) {
        House house1 = houseRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(
                        String.format("Post with id %s doesn't exist!", id)
                ));
        houseRepository.delete(house1);

    }
}
