package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    List<Person> personList= new ArrayList<>();

    public  void add(Person personToAdd){
        personList.add(personToAdd);

    }

    public  Person findById(Long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }

        }// for
        return null;
    }// findById


    public boolean contains(Person person){
        return personList.contains(person); //returns true if the object passed contains person.
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public  void remove(Long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(id);
            }
        }

    }

    public void removeAll(){
        personList.clear();
    }


    public  Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[personList.size()]);

    }

    @Override
    public Iterator iterator(){
        return personList.iterator();
    }
}//class
