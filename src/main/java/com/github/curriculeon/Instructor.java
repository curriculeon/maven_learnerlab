package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner l: learners) {
            l.learn(numberOfHoursPerLearner);
        }
    }
}
