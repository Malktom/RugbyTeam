package pl.coderslab.RugbyTeam.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name= "players")
public class Player {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @NotBlank
    @Length(min=2)
    private String name;
    @NotBlank
    @Length(min=2)
    private String surname;

    private double weight;

    private double height;

    private String position;
    private boolean readyToPlay;
    private LocalDateTime medicalCheckDate;
    private double presenceStatistic;

    @Override
    public String toString() {
        return name+" "+surname;
    }
}
