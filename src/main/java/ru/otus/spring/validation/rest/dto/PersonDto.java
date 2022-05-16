package ru.otus.spring.validation.rest.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    private int id;

    private String name;

    private int age;
}
