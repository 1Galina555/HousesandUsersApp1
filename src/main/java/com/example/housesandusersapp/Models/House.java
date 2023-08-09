package Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="house_t")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class House {
    // поля - соответствуют столбцам (атрибутам) БД
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="address_f", nullable = false)
    private String adress;
    @OneToOne
    @JoinColumn(name="id_master", referencedColumnName = "id")
    private User user;

    @Override
    public String toString() {
        return id + " - " + adress + " - " + user ;
    }
}
