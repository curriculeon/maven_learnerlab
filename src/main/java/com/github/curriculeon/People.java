package com.github.curriculeon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class People<E extends Person> implements Iterable {

    protected List<E> eList = new LinkedList<>();

    public People(){}

    public People(List list)
    {
        eList = list;
    }

    public void add (E e)
    {
        eList.add(e);
    }

    public E findById (long id)
    {
        E result = null;
        for (E e: eList) {
            if (e.getId() == id) {
                result = e;
                break;
            }
        }
        return result;
    }

    public Boolean contains (Person person)
    {
        return eList.contains(person);
    }

    public void remove (Person person)
    {
        eList.remove(person);
    }

    public void removeById (long id)
    {
        eList.remove(findById(id));
    }

    public void removeAll ()
    {
        eList.clear();
    }

    public int count()
    {
        return eList.size();
    }

    public abstract E[] toArray();

    @Override
    public Iterator iterator() {
        Iterator iterator = eList.iterator();
        return iterator;
    }
}
