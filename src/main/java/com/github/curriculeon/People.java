package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.lang.Iterable;

public class People implements Iterable {

    List<Person> personList = new ArrayList<>();

    public People() {
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for(Person person: personList) {
            if(person.getId() == id) {
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

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public void toArray() {
        personList.toArray();
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.listIterator();
    }

}