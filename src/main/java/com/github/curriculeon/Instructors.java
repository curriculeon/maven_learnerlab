package com.github.curriculeon;

public class Instructors extends  People<Instructor> {
    public static Instructors INSTANCE = new Instructors();

    private Instructors() {
        this.add(new Instructor(0L, "Leon"));
        this.add(new Instructor(1L, "Hasseb"));
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] instructorList = new Instructor[this.count()];
        for (int i = 0; i < instructorList.length; i++) {
            instructorList[i] = this.findById(i);
        }
        return instructorList;
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
