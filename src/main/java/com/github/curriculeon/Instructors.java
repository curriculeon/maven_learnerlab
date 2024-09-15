package com.github.curriculeon;

import java.util.List;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super();
        this.add(new Instructor(01L, "Leon"));
        this.add(new Instructor(02L, "Haseeb"));
    }

    @Override
    public Instructor[] toArray() {
        int sizeOfArray = count();
        List<Instructor> oldList = personList;
        return oldList.toArray(new Instructor[sizeOfArray]);
    }


    public static Instructors getInstance() {
        return INSTANCE;
    }
}
