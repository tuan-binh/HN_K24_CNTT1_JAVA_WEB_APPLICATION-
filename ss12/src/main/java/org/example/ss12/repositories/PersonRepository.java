package org.example.ss12.repositories;

import org.example.ss12.models.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepository {

    private final List<Person> personList = new ArrayList<>(
            Arrays.asList(
                    new Person(1L, "Trần Minh Quang", 18),
                    new Person(2L, "Nguyễn Đăng Quang", 20),
                    new Person(3L, "Đinh Trọng An", 20),
                    new Person(4L, "Mai Duy Anh", 20),
                    new Person(5L, "Nguyễn Sỹ Trung", 20),
                    new Person(6L, "Hoàng Văn Chung", 20)
            )
    );

    public List<Person> findAll() {
        return personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

}
