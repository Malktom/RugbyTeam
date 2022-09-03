package pl.coderslab.RugbyTeam.utils;

import pl.coderslab.RugbyTeam.model.LoginValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = LoginValidator.class)
@Target(FIELD)
@Retention(RUNTIME)
public @interface LoginAvailability {
    String message() default "Istnieje już taki login";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}