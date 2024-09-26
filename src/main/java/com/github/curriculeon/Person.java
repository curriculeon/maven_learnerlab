package com.github.curriculeon;

public class Person {
    
    //Attributes
    private final long id;
    private String name;
    
    //Start Constructors
    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }
    //End Constructors
    
    //Start Methods
    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    //End Methods

}
