package com.github.curriculeon;

public class Instructors extends People<Instructor> {

    private Instructors() {
    }

    private static class InstructorsSingletonHelper{
        private static final Instructors INSTANCE = new Instructors();
    }

    public static Instructors getInstance() {
        return InstructorsSingletonHelper.INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }
}