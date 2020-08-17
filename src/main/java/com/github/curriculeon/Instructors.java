package com.github.curriculeon;

import java.lang.reflect.Constructor;

public class Instructors extends People<Instructor> {

    private static final Instructors instance = new Instructors();

    public Instructors() {
        this.add(new Instructor(0L, "Leon Hunter"));
        this.add(new Instructor(1L, "Haseeb Muhammad"));
    }

    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[count()]);
    }

    public static Instructors getInstance() {
        return instance;
    }

}
