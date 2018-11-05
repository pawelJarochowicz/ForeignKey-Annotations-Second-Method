package exercise.hibernate.pp;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private int id;

    @Column(name = "name", length = 50, nullable = true)
    @Getter
    @Setter
    private String name;

    @Column(name = "size", nullable = true)
    @Getter
    @Setter
    private int size;


}
