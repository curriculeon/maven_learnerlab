package com.github.curriculeon;

public class Students extends People {

    private static final Students instance = new Students() ;
    private Students() {
        People students = new People();
        Person person1 = new Person(1, "Jack");
        Person person2 = new Person(2, "Jenny");
        Person person3 = new Person(3, "Justin");
        Person person4 = new Person(4, "John");
        Person person5 = new Person(5, "Julia");

        students.add(person1);
        students.add(person2);
        students.add(person3);
        students.add(person4);
        students.add(person5);
    }
    public static Students getInstance() {
        return instance;
    }

}