package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    private List<Person> personlist = new ArrayList<>();

    public void add(Person person){
        personlist.add(person);
    }

    public Person findById(Long id){
        for (Person person: personlist) {
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personlist.contains(person);
    }

    public void remove(Person person){
        personlist.remove(person);
    }

    public void remove(Long id){
        remove(findById(id));
    }

    public void removeAll(){
        personlist.clear();
    }

    public int count(){
        return personlist.size();
    }

    public Person[] toArray(){
        return personlist.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personlist.iterator();
    }
}
