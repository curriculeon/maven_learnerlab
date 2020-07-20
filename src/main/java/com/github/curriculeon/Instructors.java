package com.github.curriculeon;

public class Instructors {
    final static Instructors INSTANCE = new Instructors();
    public People instructors = new People();
    private Instructors(){
        Student instructor1 = new Student(1, "Leon");
        Student instructor2 = new Student(2, "Haseeb");

        instructors.add(instructor1);
        instructors.add(instructor2);
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }
}
