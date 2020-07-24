package com.github.curriculeon;

public class Person {

    private final long id;
    private String name;

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
    }

    public Person(Long id, String name) {
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

