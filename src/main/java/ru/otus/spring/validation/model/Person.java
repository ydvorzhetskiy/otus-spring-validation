package ru.otus.spring.validation.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Person {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    private String name;

    @Min(value = 1L)
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
