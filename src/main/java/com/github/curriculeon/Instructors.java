package com.github.curriculeon;

public class Instructors extends People {

    private static Instructors INSTANCE;

    private static People instructors;

    private Instructors() {

    }

    public static Instructors getINSTANCE() {
        if(INSTANCE == null) { //lazy loading, as opposed to eager loading
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    public People getInstructors() {
        if(instructors == null) { // lazy loading
            instructors = new People();
            Instructor instructor1 = new Instructor(444, "Lincoln Barnes");
            instructors.add(instructor1);
            //instructors.add(student2);
            //instructors.add(student3);
        }
        return instructors;
    }
}

