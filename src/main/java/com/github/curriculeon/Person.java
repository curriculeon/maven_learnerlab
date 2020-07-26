package com.github.curriculeon;

public class Person {
    //non primitive Long
    //Changing variables to Private
    private final Long id;
    private String name;

    public Person() {
        this.id = null;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
