package com.github.curriculeon;

import java.util.List;

// Students singleton - create a Students class.
//The class should be an unextendable subclass of the People class.
public class Students extends People<Student>{
    // The class should statically instantiate a final field named INSTANCE of type Students.
    private static final Students instance = new Students();

    // The class should define a private nullary constructor
    // which populates the INSTANCE field with respective Student representations of your colleagues.
    //private constructor to avoid client applications to use constructor
    private Students(){
        super(); // optional invocation
        this.add(new Student(0L, "Julia")); // Each student should have a relatively unique id field.
        this.add(new Student(1L, "David Y"));
        this.add(new Student(2L, "Ghasan"));
    }
    @Override
    public Student[] toArray() {
        int sizeOfArray = count();
        Student[] destinationArray = new Student[sizeOfArray];
        List<Student> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }

    // The class should define a getInstance method which returns the INSTANCE field
    public static Students getInstance(){
        return instance;
    }
}


