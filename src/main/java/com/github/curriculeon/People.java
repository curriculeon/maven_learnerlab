package com.github.curriculeon;

import java.util.*;

/**
 * Implemented By Monica Deshmukh
 * 07/22/2020
 */

/**
 * Create a People class.
*/
public class People implements Iterable<Person>{
    /*
     * The class should instantiate a List field of Person objects named personList.
     */
    List<Person> personList = new ArrayList<Person>();

    /*
    * The class should define a method named add which adds a Person to the personList.
    */
    public void add(Person person) {
        personList.add(person);
    }
    /*
     * The class should define a method named findById which makes use of
     * a long id parameter to return a Person object with the respective id field.
     */
    public Person findById(long id) {
        for (Person person: personList) {
            if (person.getId() == id)
                return person;
        }
        return null;    //person with id not found
    }


    /* findById using stream*/
   /** public Person findById(long id) {
       return personList.stream().filter(person -> person.getId() == id).findFirst().get();
     }*/

    /*
     * The class should define a method named contains which makes use of
     * a Person person parameter to return true if the personList contains the respective Person object.
     */
    public Boolean contains(Person person) {
        if (personList.contains(person))
            return true;
        return false;
    }
    /**
     *  The class should define a method named remove which makes use of
     *  * a Person person parameter to remove a respective Person object.
     */
     public void remove(Person person) {
        if (this.contains(person))
            personList.remove(person);
    }

    /**
     * * The class should define a method named remove which makes use of
     *  * a long id parameter to remove a Person object with the respective id field.
     *
     */
    public void remove(long id) {
        remove(findById(id));
    }
    /**
     * * The class should define a named removeAll which clears our personList field.
     */
    public  void removeAll() {
        personList.clear();
    }
    /**
     * * The class should define a method named count which returns the size of personList.
     */
    public int count() {
        return personList.size();
    }

    /**
     * * The class should define a method named toArray
     * which returns an array representation of the personList field.
     *
     */
    public Person[] toArray() {
        Person[] personArray = new Person[personList.size()];
        personList.toArray(personArray);
        return personArray;
    }

    /**
     * * The class should implement Iterable<E> and define a method named iterator
     *  * which makes use of the personList field to generate a new a Iterator<E>.
     */
    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
        //return null;
    }

}
