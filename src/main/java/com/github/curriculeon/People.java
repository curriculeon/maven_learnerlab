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

    public void remove(long id){
        Person toRemove = findById(id);

        if(toRemove != null){
            personlist.remove(toRemove);
        }
        else{
            System.out.println("ID not found in list");
        }
    }

    public void removeAll(){
        personlist.clear();
    }

    public int count(){
        return personlist.size();
    }

    public Person[] toArray(){
        Person[] x = new Person[personlist.size()];
        int count = 0;

        for (Person person: personlist) {
            x[count] = person;
            count++;
        }
        return x;
    }
}
