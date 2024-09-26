package com.github.curriculeon;

import com.github.curriculeon.Learner;

public interface Teacher {
    void teach(Learner learner, double numberOfHours );
    void lecture(Learner[] learners, double numberOfHours);
}
