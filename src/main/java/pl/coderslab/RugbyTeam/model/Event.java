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
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //    private Integer type;
    @NotBlank
    @Length(min = 2)
    private String name;
    @NotBlank
    @Length(min = 2)
    private String description;
    @ManyToOne
    private Coach coach;
    @ManyToOne
    private EventType eventType;


}
