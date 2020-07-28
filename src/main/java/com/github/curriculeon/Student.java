package com.github.curriculeon;


//Create a Student class such that:
        //Student is a subclass of Person
        //Student implements the Learner interface
public class Student extends Person implements Learner {
    //Student should have an instance variable totalStudyTime of type double
    private double totalStudyTime;
    //create 'Student' constructor
    public Student(Long id, String name) {
        //sets the id and name field to the respective values
        super(id, name);
    }

    //Student should have a concrete implementation of the learn method
    // which increments (+) the totalStudyTime variable by the specified numberOfHours argument.
    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime =  totalStudyTime + numberOfHours;
    }
    //Student should have a getTotalStudyTime() method
    // which returns the totalStudyTime instance variable.
    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}