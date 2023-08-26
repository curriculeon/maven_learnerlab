package com.github.curriculeon;

import java.util.List;

public class People {

    List<Person> personlist;

    public void add(Person person){
        personlist.add(person);
    }

    public Person findById(long id){
        for (Person person: personlist) {
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        for (Person x: personlist) {
            if(x.equals(person)){
                return true;
            }
        }
        return false;
    }


}
