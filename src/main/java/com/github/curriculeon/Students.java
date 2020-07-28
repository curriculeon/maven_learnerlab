package com.github.curriculeon;

public class Students extends People {
    private static final Students instance = new Students();

    private Students(){
        super();
        this.add(new Student(0L, "Student A"));
        this.add(new Student(1L, "Student B"));
        this.add(new Student(2L, "Student C"));

    }

    public static Students getInstance(){

        return instance;
    }


}
