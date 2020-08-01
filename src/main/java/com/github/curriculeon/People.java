package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 7/22/2020.
 */
abstract public class People<SomeLearnerType extends Person> implements Iterable<SomeLearnerType> {
    List<SomeLearnerType> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<SomeLearnerType> personList) {
        this.personList = personList;
    }

    public void add(SomeLearnerType person) {
        this.personList.add(person);
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

    public SomeLearnerType findByIdExpanded(long id) {
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

    public Boolean contains(SomeLearnerType specifiedPerson) {
        return personList.contains(specifiedPerson);
    }

    public void remove(SomeLearnerType someSpecificPerson) {
        personList.remove(someSpecificPerson);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    abstract public SomeLearnerType[] toArray();

    @Override
    public Iterator<SomeLearnerType> iterator() {
        return personList.iterator();
    }
}
