package ru.otus.spring.validation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotMargaretValidator
    implements ConstraintValidator<NotMargaret, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null) return true;
        return !"Margaret".equals(s);
    }

    @Override
    public void initialize(NotMargaret constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
