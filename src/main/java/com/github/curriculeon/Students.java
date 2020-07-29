package com.github.curriculeon;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student> {
    private final static Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(0L, "Lionel"));
        this.add(new Student(1L, "Aita"));
        this.add(new Student(2L, "Flagel"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Student[] studentList = new Student[this.count()];
        for (int i = 0; i < studentList.length; i++) {
            studentList[i] = this.findById(i);
        }
        return studentList;
    }
}
