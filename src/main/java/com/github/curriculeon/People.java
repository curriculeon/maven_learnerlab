package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People<SomeTypeOfPerson extends Person> implements Iterable<SomeTypeOfPerson> {
    protected List<SomeTypeOfPerson> personList = new ArrayList<>();

    public void add(SomeTypeOfPerson person) {
        personList.add(person);
    }

    public SomeTypeOfPerson findById(Long id) {
        return personList
                .stream()
                .filter(person -> person.getId() == id)
                .findFirst()
                .get();
    }

    public Boolean contains(SomeTypeOfPerson person) {
        return personList.contains(person);
    }

    public void remove(SomeTypeOfPerson person) {
        personList.remove(person);
    }

    public void remove(Long id) {
        remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    @Override
    public Iterator<SomeTypeOfPerson> iterator() {
        return personList.iterator();
    }

    abstract public SomeTypeOfPerson[] toArray();
}
