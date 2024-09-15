package com.github.curriculeon;

import java.util.List;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        super();
        this.add(new Student(01L, "Anjali"));
        this.add(new Student(02L, "Deepti"));
    }

    @Override
    public Student[] toArray() {
        int sizeOfArray = count();
        List<Student> oldList = personList;
        return oldList.toArray(new Student[sizeOfArray]);
    }


    public static Students getInstance() {
        return INSTANCE;
    }


}
