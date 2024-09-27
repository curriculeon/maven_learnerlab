package com.github.curriculeon;

public interface Learner {
    long getId();
    String getName();
    void learn(double numberOfHours);
    Double getTotalStudyTime();
    void setName(String name);

}