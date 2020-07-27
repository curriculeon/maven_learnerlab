package com.github.curriculeon;

public class Student extends Person implements Learner { //Student is child of Person class and accesses public methods via extends
    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);//super is used to call a nonparameterless constructor in the parent class Person
    }

    @Override//allows new version of method in child class
    public void learn(Double numberOfHours) {
        this.totalStudyTime = totalStudyTime + numberOfHours;
    }

    @Override//allows new version of method in child class
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
