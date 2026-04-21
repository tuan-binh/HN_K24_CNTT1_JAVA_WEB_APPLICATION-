package org.example.ss12.services;

import lombok.RequiredArgsConstructor;
import org.example.ss12.dtos.PersonDTO;
import org.example.ss12.models.Person;
import org.example.ss12.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor // Tiêm thông qua constructor
public class PersonService {
    private final PersonRepository personRepository;

//    @Autowired
//    public PersonService(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void addPerson(PersonDTO personDTO) {

        Person personMax = personRepository.findAll()
                .stream()
                .max(Comparator.comparingLong(Person::getId))
                .orElse(null);

        // Mọi người tìm hiểu thêm về MapStruct
        // Sử dụng annotation @Builder
        Person person = Person.builder()
                .id(personMax == null ? 1 : personMax.getId() + 1)
                .fullName(personDTO.getFullName())
                .age(personDTO.getAge())
                .build();

        personRepository.addPerson(person);
    }

}
