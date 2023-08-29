package com.github.curriculeon;

public final class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        this.add(new Instructor(1L, "Leon"));
        this.add(new Instructor(2L, "Hunter"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
