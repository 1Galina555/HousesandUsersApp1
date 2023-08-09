package Service;

import Models.House;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface HouseService {
    Iterable<House> getAll();              // получить все дома
    Optional<House> getById(Integer id);   // получить дом по id
    House add(House house);//добавить дом
    House update(Integer id,House house);//обновить целиком

    void delete(Integer id);//

}
