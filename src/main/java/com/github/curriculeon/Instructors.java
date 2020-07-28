package com.github.curriculeon;

/**
 * Use Part 7 as a reference.
 * Create a Instructors singleton which represents the set of instructors.
 * Create a TestInstructors class.
 */

/**
 * Implemented by Monica Deshmukh
 * 07/27/2020
 */
public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        this.add(new Person(11,"instructor1"));
        this.add(new Person(12,"instructor2"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
