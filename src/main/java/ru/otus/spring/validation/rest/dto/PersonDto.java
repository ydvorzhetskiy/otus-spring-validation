package ru.otus.spring.validation.rest.dto;

import lombok.*;
import ru.otus.spring.validation.validation.NotMargaret;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    private int id;

    @NotMargaret
    @NotNull(message = "Must be present")
    private String name;

    @Min(value = 1L,
        message = "Should be {value}, but you have ${validatedValue}")
    private int age;
}
