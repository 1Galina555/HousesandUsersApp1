package Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_t")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="age", nullable = false)
    private Integer age;
    @Column(name="password", nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name="id_house", referencedColumnName = "id")
    private House house;
}
