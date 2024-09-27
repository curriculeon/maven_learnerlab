package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        try {
            for(Person person : personList){
                if(person.getId().equals(id)){
                    return person;
                }
            }
        } catch (Exception e) {
            System.out.println("Person not found!!!");
        }
        return null;
    }

    public Boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(findById(id));
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
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
