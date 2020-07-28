package com.github.curriculeon;

public class Instructors extends People {
    private static final Instructors instance = new Instructors();

    public Instructors() {
        this.add(new Instructor(0L, "Leon"));
        this.add(new Instructor(1L, "Haseeb"));
    }

    public static Instructors getInstance() {
        return instance;
    }

}
