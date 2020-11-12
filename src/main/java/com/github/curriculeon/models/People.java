package com.github.curriculeon.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People<SomePersonType extends Person> implements Iterable<SomePersonType> {
    protected List<SomePersonType> personList = new ArrayList<>();

    public void add(SomePersonType person) {
        personList.add(person);
    }

    public SomePersonType findById(Long id) {
        return personList
                .stream()
                .filter(person -> person.getId() == id)
                .findFirst()
                .get();
    }

    public Boolean contains(SomePersonType person) {
        return personList.contains(person);
    }

    public void remove(SomePersonType person) {
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
    public Iterator<SomePersonType> iterator() {
        return personList.iterator();
    }

    abstract public SomePersonType[] toArray();
}
