package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People <SomeType extends Person>implements Iterable{
   List<SomeType> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<SomeType> personList) {

        this.personList = personList;
    }

    public void add(SomeType person) {

        personList.add(person);
    }

    public SomeType findById(long id) {
        for (SomeType person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(SomeType person) {
        return personList.contains(person);

    }

    public void remove(SomeType person) {
        if (personList.contains(person)) {
            personList.remove(person);
        }

    }

    public void removeById(long id) {
        SomeType person = findById(id);
            personList.remove(person);

    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    abstract public SomeType[] toArray();


    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
