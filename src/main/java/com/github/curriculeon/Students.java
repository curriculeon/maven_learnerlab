package com.github.curriculeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }
}

