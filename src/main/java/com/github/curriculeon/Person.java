package com.github.curriculeon;

public class Person {
    private final long id;
    private String name;

    public Person() {
        this(0, "");
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
