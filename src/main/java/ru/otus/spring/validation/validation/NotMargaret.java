package ru.otus.spring.validation.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NotMargaretValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotMargaret {

    String message() default "Margaret is not allowed";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
