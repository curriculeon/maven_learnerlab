package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;

public class People implements  Iterable<Person>  {
    private ArrayList<Person> personList;

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        for(Person person: this.personList){
            if(person.id == id)
                return person;
        }
        return null;
    }
    public boolean contains(Person person){
        return personList.contains(person);
    }
    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id){
        for(Person person: personList){
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
    public Person[] toArray(){
        return (Person[]) personList.toArray();
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }






}
