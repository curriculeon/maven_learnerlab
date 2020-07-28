package com.github.curriculeon;

import java.util.List;

// Create a Instructors singleton which represents the set of instructors.
// Create a Instructors class.
// The class should be an unextendable subclass of the People class.
public class Instructors extends People<Instructor> {

    // The class should statically instantiate a final field named INSTANCE of type Instructors.
    private static final Instructors instance = new Instructors();

    // The class should define a private nullary constructor
    // which populates the INSTANCE field with respective Instructor representations of your colleagues.
    public Instructors() {
        this.add(new Instructor(0L, "Leon Hunter")); // Each instructor should have a relatively unique id field.
        this.add(new Instructor(1L, "Haseeb Muhammad"));
    }
    @Override
    public Instructor[] toArray() {
        int sizeOfArray = count();
        Instructor[] destinationArray = new Instructor[sizeOfArray];
        List<Instructor> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }
    // The class should define a getInstance method which returns the INSTANCE field
    public static Instructors getInstance() {
        return instance;
    }
}



