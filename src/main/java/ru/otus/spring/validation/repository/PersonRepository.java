package ru.otus.spring.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.spring.validation.model.Person;

import javax.validation.Valid;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Override
    Person save(@Valid Person p);
}
