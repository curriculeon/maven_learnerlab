package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.lang.Iterable;

public abstract class People <E extends Person> implements Iterable<E> {

    List<E> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<E> personList) {
        this.personList = personList;
    }
    public void add(E person) {
        this.personList.add(person);
    }

    public E findById(long id) {
        for(E person: personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public abstract E[] getArray();

    @Override
    public Iterator<E> iterator() {
        return personList.listIterator();
        //return new PersonIterator<Person>(personList.iterator());
    }



}
