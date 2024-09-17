package com.github.curriculeon;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students(){
        super();
        this.add(new Student(0L, "Student A"));
        this.add(new Student(1L, "Student B"));
        this.add(new Student(2L, "Student C"));

    }

    public static Students getInstance(){

        return INSTANCE;
    }


}
