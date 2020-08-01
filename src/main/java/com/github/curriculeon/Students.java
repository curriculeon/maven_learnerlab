package com.github.curriculeon;

import java.util.List;

public class Students extends People<Student> {

    private static Students INSTANCE = new Students();

    private Students() {
        super();
        this.add(new Student(555, "Molly Fisher", 0D));
        this.add(new Student(777, "Holly Becker", 0D));
        this.add(new Student(999, "Brad Singer", 0D));
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    public Student[] getArray() {
        int sizeOfArray = count();
        Student[] destinationArray = new Student[sizeOfArray];
        List<Student> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }

}