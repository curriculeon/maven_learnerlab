package com.github.curriculeon.models;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(0L, "Neely Mann"));
        add(new Student(1L, "Michal Terranova"));
        add(new Student(2L, "Bilikis"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Student[] arrayToBePopulated = new Student[0];
        Student[] populatedArray = personList.toArray(arrayToBePopulated);
        return populatedArray;
    }

}
