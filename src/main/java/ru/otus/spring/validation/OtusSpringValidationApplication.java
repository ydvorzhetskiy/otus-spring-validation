package ru.otus.spring.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.otus.spring.validation.model.Person;
import ru.otus.spring.validation.repository.PersonRepository;

@SpringBootApplication
public class OtusSpringValidationApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(OtusSpringValidationApplication.class, args);

        PersonRepository personRepository = ctx.getBean(PersonRepository.class);

//        Person invalid = new Person("Ivan", 0);
//        personRepository.save(invalid);
    }

}
