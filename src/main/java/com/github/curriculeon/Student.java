package com.github.curriculeon;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student() {
        super();
        this.totalStudyTime = 0D;
    }

    public Student(long id, String name, Double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public Student(Double totalStudyTime) {
        super();
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
