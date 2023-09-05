package com.github.curriculeon;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        this.add(new Instructor(1L, "LEON"));
        this.add(new Instructor(2L, "HUNTER"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return this.list.toArray(new Instructor[0]);
    }
}
