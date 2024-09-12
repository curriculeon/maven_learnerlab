package com.github.curriculeon;

public class Person {
    protected final long id;
    protected String name;

    public Person (long id, String name)
    {
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
