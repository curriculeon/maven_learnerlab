package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <PersonType extends Person> implements  Iterable<PersonType>  {
    private final List<PersonType> personList;

    public  People(List<PersonType> personList){
        this.personList = personList;
    }

    public People(){
        this(new ArrayList<PersonType>());
    }


    public void add(PersonType person){
        personList.add(person);
    }

    public PersonType findById(long id){
        for(PersonType person: this.personList){
            if(person.getId() == id)
                return person;
        }
        return null;
    }
    public boolean contains(PersonType person){
        return personList.contains(person);
    }
    public void remove(PersonType person) {
        personList.remove(person);
    }

    public void remove(long id){
        for(PersonType person: personList){
            if(person.getId() == id) {
                personList.remove(person);
                return;
            }
        }
    }
    public void removeAll(){
        this.personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public abstract PersonType[] toArray();

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }









}
