package ru.otus.spring.validation.rest.mapper;

import org.springframework.stereotype.Component;
import ru.otus.spring.validation.model.Person;
import ru.otus.spring.validation.rest.dto.PersonDto;

@Component
public class PersonMapper {

    public Person toModel(PersonDto dto) {
        return new Person(dto.getName(), dto.getAge());
    }

    public PersonDto toDto(Person person) {
        return new PersonDto(
            person.getId(),
            person.getName(),
            person.getAge()
        );
    }
}
