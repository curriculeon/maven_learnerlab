package com.github.curriculeon;

public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Learner[] learners, double numberOfHours);
}
