package com.github.curriculeon;

import java.util.*;

/**
 * Implemented By Monica Deshmukh
 * 07/22/2020
 */

/**
 * Create a People class.
*/

/**
 * Parameterize the People signature to enforce that it is a container for objects of type E
 * such that E is a subclass of Person.
 * Modify the class signature to declare this class abstract.
 * An abstract class cannot be instantiated; Its concrete implementation is deferred to its subclass.
 * Modify people field to enforce that is a container of objects of type E.
 * Modify the add method to ensure that it handles object of type E.
 * Modify the findById method to ensure that it returns an object of type E.
 * Modify the getArray method signature by declaring it abstract of return type E.
 * An abstract method is a subclass's contractual agreement to the deferment
 * of an implementation of a respective method.
 */

/**
 * Implemented by Monica Deshmukh 07/28/2020
 */
public abstract class People <E extends Person> implements Iterable<E>{
    /*
     * The class should instantiate a List field of Person objects named personList.
     */
    List<E> personList;

    public People() {
        personList = new ArrayList<E>();
    }

    /*
    * The class should define a method named add which adds a Person to the personList.
    */
    public void add(E personType) {
        personList.add(personType);
    }
    /*
     * The class should define a method named findById which makes use of
     * a long id parameter to return a Person object with the respective id field.
     */
    public E findById(long id) {
        for (E personType: personList) {
            //if (personList instanceof Person)
                if (personType.getId() == id)
                    return personType;
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
    public Boolean contains(E personType) {
        if (personList.contains(personType))
            return true;
        return false;
    }
    /**
     *  The class should define a method named remove which makes use of
     *  * a Person person parameter to remove a respective Person object.
     */
     public void remove(E personType) {
        if (this.contains(personType))
            personList.remove(personType);
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
    public abstract E[] toArray();

    /**
     * * The class should implement Iterable<E> and define a method named iterator
     *  * which makes use of the personList field to generate a new a Iterator<E>.
     */
    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
        //return null;
    }

}
