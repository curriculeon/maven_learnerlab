package com.github.curriculeon;
/*
    The Student class is a Person and can learn.
    Student must call parent's constructor using keyword super if that constructor uses arguments to be instantiated.
 */
public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = 0;
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
