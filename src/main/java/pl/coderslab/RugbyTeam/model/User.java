package pl.coderslab.RugbyTeam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "users")
@NoArgsConstructor
@AllArgsConstructor// is this required by JPA?
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String login;
    private String email;
    private String password;
    private Integer role;


}