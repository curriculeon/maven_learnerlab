package com.github.curriculeon;

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
}