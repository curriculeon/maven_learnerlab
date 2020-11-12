package com.github.curriculeon.models;

public class Instructors extends People<Instructor> {
    private static Instructors INSTANCE;

    private Instructors() {
        add(new Instructor(0L, "Leon Hunter"));
        add(new Instructor(1L, "Fred Zirdung"));
        add(new Instructor(2L, "David S"));
    }

    public static Instructors getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] arrayToBePopulated = new Instructor[0];
        Instructor[] populatedArray = personList.toArray(arrayToBePopulated);
        return populatedArray;
    }
}
