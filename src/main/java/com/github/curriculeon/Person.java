package com.github.curriculeon;

public class Person {
final long id;
String name;


    public Person(long newId, String newName) {
        this.id = getId(newId);
        this.name = getName();
    }
    public Person() {
        this.id = 0;
        this.name = null;
    }

    // Getter
    public String getName() {
        return name;
    }
    public final long getId(long newId) {
        return newId;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

}
