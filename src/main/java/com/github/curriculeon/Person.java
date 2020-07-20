package com.github.curriculeon;

public class Person {
    private final long id;
    private String name;

    Person(){
        id = 0;
        name = "";
    }
    Person(long i, String s){
        id = i;
        name = s;
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
