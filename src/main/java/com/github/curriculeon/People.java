package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> {
    List<E> personList = new ArrayList<E>();

    public void add(E person) {
        this.personList.add(person);
    }

    public E findById(long id) {
        E returnedObj = null;
        for (E i : this.personList) {
            if (i.id == id) {
                returnedObj = i;
                break;
            }
        }
        return returnedObj;
    }

    public boolean contains(E person) {
        boolean checkContainValue = false;
        for (E i : this.personList) {
            if (i.name == person.name) {
                checkContainValue = true;
                break;
            }
        }
        return checkContainValue;
    }

    public void remove(E person) {
        for (E i : this.personList) {
            if (i == person) {
                this.personList.remove(person);
                break;
            }
        }
    }

    public void remove(long id) {
        for (E i : this.personList) {
            if (i.id == id) {
                this.personList.remove(i);
                break;
            }
        }
    }

    public void removeAll() {
        this.personList.clear();
    }

    public int count() {
        return this.personList.size();
    }

    public abstract E[] toArray();

    public Iterator<E> iterator() {
        return this.personList.iterator();
    }
}
