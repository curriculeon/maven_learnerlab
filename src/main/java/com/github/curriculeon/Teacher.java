package com.github.curriculeon;

public interface Teacher {//this interface is implemented by Person class
    void teach(Learner learner, Double numberOfHours);
    void lecture(Learner[] learners, Double numberOfHours);
}
