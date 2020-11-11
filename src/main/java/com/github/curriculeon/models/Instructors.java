package com.github.curriculeon.models;

public class Instructors extends People{
    private static Instructors INSTANCE;

    private Instructors() {
        add(new Instructor(0l,"Leon"));
        add(new Instructor(0L,"Fred"));
        add(new Instructor(0l,"David"));
    }

    public static Instructors getInstance() {
        if (INSTANCE ==null) {
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }
}
