package exercise.hibernate.pp;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private int id;

    @Column(name="league", length = 50, nullable = true)
    @Getter
    @Setter
    private String league;

    @ManyToOne
    @JoinColumn(name="city_id", foreignKey = @ForeignKey(name="CATEGORY_ID_FK"))
    @Getter
    @Setter
    City city;
}
