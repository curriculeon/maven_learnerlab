package com.github.curriculeon;

public class Person {
    private final long id;
    private String name;

    public Person (long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName(String name) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
