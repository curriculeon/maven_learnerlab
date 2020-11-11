package com.github.curriculeon.models;

import com.github.curriculeon.interfaces.Learner;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
        this.totalStudyTime = getTotalStudyTime();
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
