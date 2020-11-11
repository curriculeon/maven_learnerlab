package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private final List<Person> personList = new ArrayList<>();

    public void add(Person person) { personList.add(person); }

    public  Person findById(Long id) {
        return personList
                .stream()
                .filter(person -> person.getId() == id)
                .findFirst()
                .get();
    }

    public Boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) { personList.remove(person); }

    public void remove(Long id) {
        remove(findById(id));
        //personList.removeIf(person -> person.getId() == id);
    }

    public void removeAll() { personList.clear(); }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
