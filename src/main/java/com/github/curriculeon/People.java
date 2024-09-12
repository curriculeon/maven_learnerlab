package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    private List<E> list;

    public People() {
        list = new ArrayList<>();
    }

    public void add(E e) {
        list.add(e);
    }

    public E findById(long id) {
        E found = null;
        for(E e : list) {
            if(e.getId() == id) found = e;
        }
        return found;
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

    public void remove(E e) {
        list.remove(e);
    }

    public void remove(long id) {
        list.remove(findById(id));
    }

    public void removeAll() {
        list.clear();
    }

    public int count() {
        return list.size();
    }

    public abstract E[] toArray();

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
