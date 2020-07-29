package com.github.curriculeon;

public class Instructors extends People {

    private static Instructors INSTANCE;

    private Instructors() {}

    public static Instructors getINSTANCE() {
        if(INSTANCE == null) { //lazy loading, as opposed to eager loading
            INSTANCE = new Instructors();
            INSTANCE.add(new Instructor(444, "Lincoln Barnes"));
        }
        return INSTANCE;
    }

}

