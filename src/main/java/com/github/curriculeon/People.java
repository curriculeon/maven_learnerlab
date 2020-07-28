package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    private List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person) {
        return personList.contains(person);

    }

    public void remove(Person person) {
        if (personList.contains(person)) {
            personList.remove(person);
        }

    }

    public void removeById(long id) {
        Person person = findById(id);
            personList.remove(person);

    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        Person[] person = personList.toArray(new Person[personList.size()]);
        return person;
    }


    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
