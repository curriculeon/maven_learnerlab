package com.github.curriculeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People<SomeLearnerType extends Person> implements Iterable<SomeLearnerType>{

    List<SomeLearnerType> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<SomeLearnerType> personList) {
        this.personList = personList;
    }

    public void add(SomeLearnerType personToBeAdded) {
        this.personList.add(personToBeAdded);
    }

    public SomeLearnerType findById(long id) {
        for (int i = 0; i < personList.size(); i++) {
            SomeLearnerType person = personList.get(i);
            if (person.getId() == id) { //if the id is correct,
                return person; // return person
            } else { // if its the wrong id,
                continue; // keep lookin'!
            }
        } // finished loop; we've finished lookin'
        return null; // we were not able to find the person with the id
    }

    public Boolean contains(SomeLearnerType  personToBeFound) {
      return personList.contains(personToBeFound);
    }

    public void remove(SomeLearnerType  person) {
        personList.remove(person);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
      return personList.toArray(new Person[personList.size()]);
    }

    @Override
    public Iterator<SomeLearnerType > iterator() {
        return personList.iterator();
    }
}
