package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract  class People<SomePerson extends Person> implements Iterable<SomePerson> {
    List<SomePerson> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<SomePerson> personList) {
        this.personList = personList;
    }

    public void add(SomePerson person){
        personList.add(person);
    }

    public SomePerson findById(long id){
        for (SomePerson person: personList) {
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    public boolean contains(SomePerson person){
        return this.personList.contains(person);
    }

    public void remove(SomePerson person){
        this.personList.remove(person);
    }

    public void remove(long id){
        for (Person person: personList) {
            if(person.getId().equals(id)){
                this.personList.remove(person);
            }
        }
    }

    public void removeAll(){
        this.personList.clear();
    }

    public int count(){
        return this.personList.size();
    }


    abstract public SomePerson[] toArray();

//    public Person[] toArray(){   //return People or Person ??
//        return this.personList.toArray(new Person[personList.size()]);
//    }

    @Override
    public Iterator<SomePerson> iterator() {
        return personList.iterator();
    }
}
