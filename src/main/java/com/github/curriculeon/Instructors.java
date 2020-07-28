package com.github.curriculeon;

public class Instructors extends People {

    private static final Instructors instance = new Instructors();

    private Instructors() {

        this.add(new Person(0L, "Professor Peep"));
        this.add(new Person(0L, "Professor George"));
    }

    public static Instructors getInstance() {
        return instance;
    }


}

