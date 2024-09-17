package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
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

    public void removeAll() {

        personList.clear();
    }

    public int count() {

        return personList.size();
    }

    public Person[] toArray() {
        int arrayLength = personList.size();
        Person[] newArray = new Person[arrayLength];
        return personList.toArray(newArray);
    }

    public Iterator<Person> iterator() {

        return personList.iterator();
    }

}