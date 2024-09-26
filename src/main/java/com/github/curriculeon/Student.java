package com.github.curriculeon;

public class Student extends Person implements Learner {

    //Attributes
    private double totalStudyTime;

    //Start Constructor
    public Student(long id, String name) {
        super(id, name);
        Students.getInstance().add(this);
    }
    //End Constructor

    //Start Methods
    @Override
    public void learner(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    //End Methods
}
