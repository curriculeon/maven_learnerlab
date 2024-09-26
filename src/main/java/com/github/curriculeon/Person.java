package com.github.curriculeon;

public class Person { //Person is parent class
    final long id; //final cannot change
    private String name;

    public Person() {
        this.id = null;
    }

    Person(long id, String name){
        this.id = id;
        this.name = name;
    }
    public long getId(){
        return id;
    }
    public String getName(){  //get method/getter used because name is private
        return name;
    }
    public void setName(String name){ //set method/setter used because name is private
        this.name = name;
    }

}
