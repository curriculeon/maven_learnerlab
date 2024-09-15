package com.github.curriculeon;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

//Create a People class
// The class should instantiate a List field of Person objects named personList.
abstract public class People <SomeLearnerType extends Person> implements Iterable<SomeLearnerType> {
        List<SomeLearnerType> personList;

        public People() {
            this(new ArrayList<>());
        }
        // Create 'People' Constructor
        public People(List<SomeLearnerType> personList) {
            //set a List field of Person objects named personList to the respective value
            this.personList = personList;
    }

        // The class should define a method named add which adds a Person to the personList.
        public void add(SomeLearnerType person) {
            this.personList.add(person);
    }
        // The class should define a method named findById
        // which makes use of a long id parameter to return a Person object with the respective id field.
        public SomeLearnerType findById(long id) {
            for (int i = 0; i < personList.size(); i++) {
                SomeLearnerType person = personList.get(i);
                if (person.getId() == id) { //if the id is correct,
                    return person; // return person
                } else { // if its the wrong id,
                    continue; // keep looking
                }
            } // finished loop; we've finished looking
            return null; // we were not able to find the person with the id
        }

        // The class should define a named contains which makes use of a Person person parameter
        // to return true if the personList contains the respective Person object.
        public SomeLearnerType findByIdExpanded(long id) {
            for (int i = 0; i < personList.size(); i++) {
                SomeLearnerType person = personList.get(i);
                if (person.getId() == id) { //if the id is correct,
                    return person; // return person
                } else { // if its the wrong id,
                    continue; // keep looking
                }
            } // finished loop; we've finished looking
            return null; // we were not able to find the person with the id
        }
        public Boolean contains(SomeLearnerType specifiedPerson) {
            return personList.contains(specifiedPerson);
    }
        // The class should define a method named remove
        // which makes use of a Person person parameter to remove a respective Person object.
        public void remove(SomeLearnerType someSpecificPerson) {
            personList.remove(someSpecificPerson);
        }

        // The class should define a method named remove
        // which makes use of a long id parameter
        // to remove a Person object with the respective id field.

        // The class should define a named removeAll which clears our personList field.
         public void removeAll() {
             personList.clear();
         }
        // The class should define a method named count
        // which returns the size of personList.
        public int count() {
            return personList.size();
        }

        // The class should define a method named toArray
        // which returns an array representation of the personList field.

        abstract public SomeLearnerType[] toArray();
        // The class should implement Iterable<E> and define a method named iterator
        // which makes use of the personList field to generate a new a Iterator<E>

        @Override
        public Iterator<SomeLearnerType> iterator() {
            return personList.iterator();
        }
}