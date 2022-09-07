package pl.coderslab.RugbyTeam.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@Table(name= "coaches")
public class Coach {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // IDENTITY zeby nie tworzylo hibernate_sequence
    private Integer id;
    @NotBlank
    @Length(min=2)
    private String name;
    @NotBlank
    @Length(min=2)
    private String surname;


}
