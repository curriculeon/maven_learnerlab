package com.github.curriculeon;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



//Created class People

public class People implements Iterable {

    //Instantiated a List field of Person objects named personList

    List<Person> personList = new ArrayList<>();

    //method named add adding Person to personList
    public void add(Person personToBeAdded) {
        personList.add(personToBeAdded);
    }

//Method named findById using long id as parameter, returning Person object with respective id field
    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }

        return null;
    }

    //Method named contains using Person person parameter to return true if personList contains respective Person object
    public Boolean contains(Person person) {
        return personList.contains(person);
    }

    //Method named remove using Person person parameter to remove respective Person object
    public void remove(Person person) {
        personList.remove(person);
    }

    //Method named removeAll clearing personList field
    public void removeAll(Person person) {
        personList.clear();
    }

    //Method named count returning size of personList
    public int count(){
        return personList.size();
    }

    //method named toArray returning an array representation of personList field
    public Person[] toArray(){
       return personList.toArray(new Person[personList.size()]);
    }

     //class implementing Iterable<E> and defining a method named iterator which makes use of personList field to generate new Iterator<E>
    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}


