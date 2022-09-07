package pl.coderslab.RugbyTeam.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.descriptor.sql.LobTypeMappings;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;
import java.sql.Blob;
import java.util.List;

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
    @ManyToMany
    private List<Player> players;

    @Lob
    private byte[] image;


}
