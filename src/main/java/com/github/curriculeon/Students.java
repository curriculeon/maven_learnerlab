package com.github.curriculeon;

import java.util.List;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        super(); // optional invocation
        this.add(new Student(0L,"OneMore"));
        this.add(new Student(1L,"someone"));
        this.add(new Student(2L,"AnotherOne"));
    }

    @Override
    public Student[] toArray() {
        int sizeOfArray = count();
        Student[] destinationArray = new Student[sizeOfArray];
        List<Student> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
