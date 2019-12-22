package com.github.curriculeon;

public final class Instructors extends People {
    private static final Instructors instance = new Instructors();

    private People people;

    private Instructors()
    {
        people = new People();

        Instructor instructor1 = new Instructor(1, "John");
        people.add(instructor1);
        Instructor instructor2 = new Instructor(2, "Alice");
        people.add(instructor2);
        Instructor instructor3 = new Instructor(3, "Eve");
        people.add(instructor3);
        Instructor instructor4 = new Instructor(4, "Bob");
        people.add(instructor4);
        Instructor instructor5 = new Instructor(5, "Jim");
        people.add(instructor5);
    }

    public static Instructors getInstance(){
        return instance;
    }

    public Instructor getById(long id)
    {
        return (Instructor) people.findById(id);
    }
}
