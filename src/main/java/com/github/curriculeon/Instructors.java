package com.github.curriculeon;

import java.util.List;


public class Instructors extends People<Instructor> {
    private static final Instructors instance = new Instructors();

    public Instructors() {
        this.add(new Instructor(0L, "Leon Hunter"));
        this.add(new Instructor(1L, "Haseeb Muhammad"));
    }

    @Override
    public Instructor[] toArray() {
        int sizeOfArray = count();
        Instructor[] destinationArray = new Instructor[sizeOfArray];
        List<Instructor> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }

    public static Instructors getInstance() {
        return instance;
    }
}