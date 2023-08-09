package Service;

import Models.House;
import Models.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    Iterable<User> getAll();              // получить всех жителей
    Optional<User> getById(Integer id);   // получить жителей по id
    User add(Integer id_master,User user,House house);//добавить жителей
    House update(Integer id_master,Integer id,House house);//обновить целиком

    void delete(Integer id);//удалять жильца
}
