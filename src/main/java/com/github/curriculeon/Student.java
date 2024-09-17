package com.github.curriculeon;

/*
Create a Student class such that:
Student is a subclass of Person
Student implements the Learner interface
Student should have an instance variable totalStudyTime of type double
Student should have a concrete implementation of the learn method which increments the totalStudyTime variable by the specified numberOfHours argument.
Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.
 */

public class Student extends  Person implements Learner {
Double totalStudyTime;

    Student(long id, String name) {
        super(id, name);
        this.totalStudyTime=0.0;
    }

    @Override
    public  void learn(Double numOfHours) {
        this.totalStudyTime=this.totalStudyTime+numOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
