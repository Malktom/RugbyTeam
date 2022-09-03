package pl.coderslab.RugbyTeam.model;

import lombok.RequiredArgsConstructor;
import pl.coderslab.RugbyTeam.services.UserService;
import pl.coderslab.RugbyTeam.utils.LoginAvailability;

import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class LoginValidator implements javax.validation.ConstraintValidator<LoginAvailability, String> {

    private final UserService userService;

    @Override
    public boolean isValid(String login, ConstraintValidatorContext context) {
        return userService.findByLogin(login.toLowerCase()).isEmpty();
    }
}
