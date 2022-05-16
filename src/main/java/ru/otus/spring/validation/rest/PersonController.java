package ru.otus.spring.validation.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.otus.spring.validation.repository.PersonRepository;
import ru.otus.spring.validation.rest.dto.PersonDto;
import ru.otus.spring.validation.rest.mapper.PersonMapper;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository repository;

    private final PersonMapper mapper;

    @GetMapping("/person")
    public List<PersonDto> getAll() {
        return repository.findAll().stream()
            .map(mapper::toDto)
            .collect(toList());
    }

    @PostMapping("/person")
    @ResponseStatus(HttpStatus.CREATED)
    public PersonDto save(@RequestBody PersonDto dto) {
        var toSave = mapper.toModel(dto);
        var saved = repository.save(toSave);
        return mapper.toDto(saved);
    }
}
