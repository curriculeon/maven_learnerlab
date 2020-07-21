package com.github.curriculeon;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(Long id, String name, Double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return  this.totalStudyTime;
    }
}
