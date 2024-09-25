package com.github.curriculeon;

/*
 * Created By Emmanuel Orubele
 *  on 7/21/2020
 */

public class Person {
    private final Long id;
    private String name;

public Person() {
    this.id = getId();
}
    public Person(Long id, String name){
        this.id = id;
        this.name = name;
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
}
