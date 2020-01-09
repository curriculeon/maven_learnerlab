package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {
    List<Person> personList = new ArrayList<Person>();
    public void add(Person person) {
        personList.add(person);
    }
    public Person findById(long id) {
        for (Person person : personList ){
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
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

    public Person[] toArray() {
        return (Person[]) personList.toArray();
    }

    public Iterator<Person> iterator()  {
        return personList.iterator();
    }
}
