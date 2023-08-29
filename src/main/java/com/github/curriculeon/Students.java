package com.github.curriculeon;

public final class Students extends People {

    private static Students INSTANCE = new Students();

    private Students(){
       this.add(new Student(1L, "Jarek"));
       this.add(new Student(2L, "Mary"));
       this.add(new Student(3L, "Andrew"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
