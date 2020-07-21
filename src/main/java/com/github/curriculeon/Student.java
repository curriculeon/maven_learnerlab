package com.github.curriculeon;

/**
 * Create Student Class
 * Create a Student class such that:
 * Student is a subclass of Person
 * Student implements the Learner interface
 * Student should have an instance variable totalStudyTime of type double
 * Student should have a concrete implementation of the learn method which increments
 * the totalStudyTime variable by the specified numberOfHours argument.
 * Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.
 */

/**
 * Implemented By Monica Deshmukh
 * 07/20/2020
 */
public class Student extends Person implements Learner{
    double totalStudyTime;

    public  Student(long id, String name){
        super(id, name);
        totalStudyTime = 0;
    }
    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
