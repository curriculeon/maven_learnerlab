package com.github.curriculeon;

/**
 * Use Part 7 as a reference.
 * Create a Instructors singleton which represents the set of instructors.
 * Create a TestInstructors class.
 */

import java.util.List;

/**
 * Implemented by Monica Deshmukh
 * 07/27/2020
 */
public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        this.add(new Instructor(11,"instructor1"));
        this.add(new Instructor(12,"instructor2"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        //return INSTANCE.toArray();
        Instructor[] instructorArray = new Instructor[personList.size()];//should make a method in Person class to retrun personList.size()
        List<Instructor> instructorList = personList;
        instructorList.toArray(instructorArray);
        return instructorArray;
    }
}
