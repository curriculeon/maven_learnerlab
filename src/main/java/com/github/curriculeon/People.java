package com.github.curriculeon;

import java.util.Iterator;
import java.util.List;

public class People<E> implements Iterable<E> {
    private List<Person> personList;

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        if(personList.contains(id)){
            return null;
        }
        else{
            return null;
        }
    }
    public boolean contains(Person person){
        return personList.contains(person);
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void remove(long id){
        personList.remove(id);
    }
    public void removeAll(){
        personList.clear();
    }
    public Integer count(){
        return personList.size();
    }
    public Person[] toArray(){
        return (Person[]) personList.toArray();
    }

    @Override
    public Iterator<E> iterator() {
        return  (Iterator<E>) personList.iterator();
    }
}
