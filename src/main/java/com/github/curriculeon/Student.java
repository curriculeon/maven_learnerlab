package com.github.curriculeon;

public class Student extends Person implements Learner {
    private double totalStudyTime = 0.0;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return  this.totalStudyTime;
    }
}
