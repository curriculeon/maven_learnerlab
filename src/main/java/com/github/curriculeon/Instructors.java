package com.github.curriculeon;

public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super();
        this.add(new Instructor(01L, "Leon"));
        this.add(new Instructor(02L, "Haseeb"));
    }


    public static Instructors getInstance() {
        return INSTANCE;
    }
}
