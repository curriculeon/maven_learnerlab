package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class People {
    private List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public  Person findById(Long id) {
        return personList
                .stream()
                .filter(person -> person.getId() == id)
                .findFirst()
                .get();
    }


}
