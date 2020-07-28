package com.github.curriculeon;

public class Students extends People {


    private static final Students INSTANCE = new Students();

    private Students() {
        super();
        this.add(new Person(0L, "Steven"));
        this.add(new Person(1L, "Greg"));
        this.add(new Person(2L, "Joe"));

    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
