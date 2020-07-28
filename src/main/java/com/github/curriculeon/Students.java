package com.github.curriculeon;

/**
 * Note: The creation of this class will demonstrate an implementation of singleton design pattern.
 * Create a Students class.
 * The class should be an unextendable subclass of the People class.
 * The class should statically instantiate a final field named INSTANCE of type Students.
 * The class should define a private nullary constructor which populates the INSTANCE field
 * with respective Student representations of your colleagues.
 * Each student should have a relatively unique id field.
 * The class should define a getInstance method which returns the INSTANCE field.
 */

/**
 * Implemented By Monica Deshmukh 07/24/2020
 */
public class Students extends People{
    private static final Students INSTANCE = new Students();
    private Students() {
        this.add(new Person(1, "student1"));
        this.add(new Person(2, "student2"));
        this.add(new Person(3, "student3"));
    }

    public static Students getInstance() {

        return INSTANCE;
    }
}


