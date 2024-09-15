package com.github.curriculeon;

//create a 'Person' class
public class Person {
    private final Long id;//declare final field named 'id' of type 'long'
    private String name;//declare a field named 'name' of type String

    // create 'Person' constructor
    public Person() {
        this.id = null;
    }
    public Person(Long id, String name) { // with parameters of type long and String
        //sets the id and name field to the respective values
        this.id = id;
        this.name = name;
    }
    //class should define a getId() method which returns the Person object's id field.
    public Long getId() {
        return id;
    }
    //define a getName() method which returns the Person object's name field.
    public String getName() {
        return name;
    }
    //define a setName() method which sets the Person object's name field.
    public void setName(String name) {
        this.name = name;
    }
}