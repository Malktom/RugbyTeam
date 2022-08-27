package pl.coderslab.RugbyTeam.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name= "players")
public class Player {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private double weight;
    private double height;
    private String position;
    private boolean readyToPlay;
    private LocalDateTime medicalCheckDate;
    private double presenceStatistic;


}
