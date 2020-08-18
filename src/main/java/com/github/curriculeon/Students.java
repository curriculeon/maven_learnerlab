package com.github.curriculeon;

import java.util.List;

public class Students extends People<Student> {
    private static final Students instance = new Students();

    private Students(){
        super();
        this.add(new Student(0L, "Chris"));
        this.add(new Student(1L, "William"));
        this.add(new Student(2L, "Adam"));
    }

    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[count()]);
    }

    public static Students getInstance(){
        return instance;
    }
}
