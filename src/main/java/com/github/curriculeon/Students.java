package com.github.curriculeon;

import java.util.List;

public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();
    //private Map<Integer, String> mates = new HashMap<Integer, String>();
    // tried to use a hash map.

    private Students(){
        this.add(new Student(10l, "Christopher"));
        this.add( new Student(15l, "David"));


    }

    @Override
    public Student[] toArray() {
        int arraySize = count();
        Student[] destinationArr = new Student[arraySize];
        List<Student> sourceList = personList;
        return sourceList.toArray(destinationArr);

    }

    public static Students getINSTANCE(){
        return INSTANCE;
    }
}
