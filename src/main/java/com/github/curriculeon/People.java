package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements  Iterable<E>  {
    private List<E> personList = new ArrayList<E>();

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for(E person: this.personList){
            if(person.id == id)
                return person;
        }
        return null;
    }
    public boolean contains(E person){
        return personList.contains(person);
    }
    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long id){
        for(E person: personList){
            if(person.id == id) {
                personList.remove(person);
                return;
            }
        }
    }
    public void removeAll(){
        this.personList = null;
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] toArray();

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }









}
