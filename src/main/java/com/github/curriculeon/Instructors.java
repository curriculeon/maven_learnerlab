package com.github.curriculeon;

import java.util.List;

public class Instructors extends People<Instructor> {

    private static Instructors INSTANCE;

    private Instructors() {}

    public static Instructors getINSTANCE() {
        if(INSTANCE == null) { //lazy loading, as opposed to eager loading
            INSTANCE = new Instructors();
            INSTANCE.add(new Instructor(444, "Lincoln Barnes"));
        }
        return INSTANCE;
    }

    public Instructor[] getArray() {
        int sizeOfArray = count();
        Instructor[] destinationArray = new Instructor[sizeOfArray];
        List<Instructor> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }

}

