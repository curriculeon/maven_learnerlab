package com.github.curriculeon;

import java.util.Iterator;

public class Students extends People<Student> {

    private static final Students instance  = new Students() ;
    private Students() {
        Student person1 = new Student(1, "Jack");
        Student person2 = new Student(2, "Jenny");
        Student person3 = new Student(3, "Justin");
        Student person4 = new Student(4, "John");
        Student person5 = new Student(5, "Julia");

        super.add(person1);
        super.add(person2);
        super.add(person3);
        super.add(person4);
        super.add(person5);
    }
    public static Students getInstance() {
        return instance;
    }

    public Student[] toArray() {
        return super.personList.toArray(new Student[0]);
    }
}