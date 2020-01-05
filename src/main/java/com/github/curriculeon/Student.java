package com.github.curriculeon;

public class Student extends Person implements Learner{
double totalStudyTime;
    @Override
    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
