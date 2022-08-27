package pl.coderslab.RugbyTeam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@Table(name= "users")

public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @NotBlank
    @Length(min=2)
    private String login;
    @NotBlank
    @Length(min=2)
    private String email;
    @NotBlank
    @Length(min=2)
    private String password;
    @NotBlank
    private Integer role;


}