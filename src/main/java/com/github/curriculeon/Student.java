package com.github.curriculeon;

public  class Student extends Person implements Learner {

    public double totalStudyTime;

    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public Double getStudyTotalTime() {
        return totalStudyTime;
    }
}