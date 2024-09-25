package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

abstract class People<somePeople extends Person> implements Iterable{
    List<somePeople> personList;
    public People(){
        new ArrayList<>();
    }

    public People(List<somePeople> personList){
        this.personList = personList;
    }
    public  void add(somePeople personToAdd){
        personList.add(personToAdd);
    }

    public  somePeople findById(Long id) {
        for (int i = 0; i < personList.size() ; i++) {
            somePeople person = personList.get(i);
            if (person.getId() == id){// check if the person exist.
                return person;
            }else {
                continue; // keep looking until id is found
            }
        }// for
        return null;
    }// findById


    public boolean contains(somePeople person){
        return personList.contains(person); //returns true if the object passed contains person.
    }

    public void remove(somePeople person) {
        personList.remove(person);
    }

    public  void remove(Long id) {
        for (somePeople person : personList) {
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

    abstract public somePeople[] toArray();

    @Override
    public Iterator<somePeople> iterator(){
        return personList.iterator();
    }
}//class
