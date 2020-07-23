package com.github.curriculeon;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class People implements Iterable {

    public List<Person> personList = new ArrayList<>();

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

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        personList.remove(id);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[personList.size()]);
    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
