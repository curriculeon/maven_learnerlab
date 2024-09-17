package com.github.curriculeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E> {
    List<E> personList = new ArrayList();

    public void add(E person) {
        personList.add(person);
    }
    public E findById(long id) {
        for (E person : personList ){
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    public boolean contains(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long id) {
        personList.remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public abstract E[] toArray();

    public Iterator<E> iterator()  {
        return personList.iterator();
    }
}
