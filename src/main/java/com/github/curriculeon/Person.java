package com.github.curriculeon;

public class Person {
final long id;
String name;


    public Person() {
        id = getId();
        this.name = getName();
    }

    // Getter
    public String getName() {
        return name;
    }
    public final long getId() {
        return id;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

}
