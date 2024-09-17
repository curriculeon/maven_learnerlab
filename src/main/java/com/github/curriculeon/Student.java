package com.github.curriculeon;

public class Student extends Person implements Learner{
    private double totalStudyTime=0;
    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
