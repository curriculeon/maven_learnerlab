package com.github.curriculeon;

public class Instructors extends People<Instructor> {

    private static final Instructors instance = new Instructors() ;
    private Instructors() {
        /*Instructor person1 = new Instructor(1,"Leon");
        Instructor person2 = new Instructor(2,"Ali");
        Instructor person3 = new Instructor(3, "Lenny");

        super.add(person1);
        super.add(person2);
        super.add(person3);
        */
        super.add(Educator.LEON.getInstructor());
        super.add(Educator.ALI.getInstructor());
        super.add(Educator.LENNY.getInstructor());
    }
    public static Instructors getInstance() {
        return instance;
    }
    public Instructor[] toArray() {
        return instance.toArray();
    }

}