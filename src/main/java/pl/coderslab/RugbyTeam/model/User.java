package pl.coderslab.RugbyTeam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import pl.coderslab.RugbyTeam.utils.LoginAvailability;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name= "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @LoginAvailability
    private String login;
    @NotBlank
    @Length(min=2)
    private String email;
    @NotBlank
    @Length(min=2)
    private String password;
//    @NotBlank
    private Integer role;



}