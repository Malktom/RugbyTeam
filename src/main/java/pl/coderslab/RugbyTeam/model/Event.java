package pl.coderslab.RugbyTeam.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "events")
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer type;
    private String name;
    private String description;
    @ManyToOne
    private Coach coach;


}
