package com.github.curriculeon;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student() {
        super(0,"some Name");
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}