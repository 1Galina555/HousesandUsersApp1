package com.example.housesandusersapp.rdb;

import com.example.housesandusersapp.DTO.UserDto;
import com.example.housesandusersapp.Models.House;
import com.example.housesandusersapp.Models.User;
import com.example.housesandusersapp.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class DbUserService  implements UserService  {
    private final UserRepository userRepository;
    public DbUserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }
    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Integer id) {
        return userRepository.findById(id);
    }
    @Override
    public User add( UserDto userDto) {
            User user=new User();
            user.setName(userDto.getName());
            user.setAge(userDto.getAge());
            user.setPassword(userDto.getPassword());
        return userRepository.save(user);
        }


    @Override
    public User update( Integer id, UserDto userDto) {

             User user1 = userRepository.findById(id)
                    .orElseThrow(() -> new NoSuchElementException(
                            String.format("Post with id %s doesn't exist!", id)));

            user1.setName(userDto.getName());
            user1.setAge(userDto.getAge());
            user1.setPassword(userDto.getPassword());
            return userRepository.save(user1);
        }


    @Override
    public void delete(Integer id) {
        User user1 = userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(
                        String.format("Post with id %s doesn't exist!", id)
                ));
        userRepository.delete(user1);
    }
}
