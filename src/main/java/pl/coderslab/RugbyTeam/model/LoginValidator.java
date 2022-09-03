package pl.coderslab.RugbyTeam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import pl.coderslab.RugbyTeam.services.UserService;
import pl.coderslab.RugbyTeam.utils.LoginAvailability;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class LoginValidator implements ConstraintValidator<LoginAvailability, String> {

    @Autowired
    private UserService userService;

    @Override
    public boolean isValid(String login, ConstraintValidatorContext context) {
        return userService.findUserByLoginName(login.toLowerCase()).isEmpty();
    }
}
