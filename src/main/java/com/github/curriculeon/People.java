package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<E> {
    List<Person> personList = new ArrayList<>();

    public void add (Person person) {
        this.personList.add(person);
    }

    public Person findById(long id) {
        for(Person person : personList) {
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
        personList.remove(person);
    }

    public void remove(long id) {
        for(Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }
        }
    }

    public void removeAll(List<Person> personList) {
        personList.clear();
    }

    public int count(List<Person> personList) {
        return personList.size();
    }

    public Object[] toArray(List<Person> personList) {
        return personList.toArray();
    }

    public Iterator<E> iterator(List<Person> personList) {
        return personList.iterator() = new Iterator<E>();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}