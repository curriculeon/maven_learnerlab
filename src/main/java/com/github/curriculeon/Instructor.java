package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learner, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/learner.length;

        for (Learner l : learner) {
            teach(l, numberOfHoursPerLearner);
        }
    }
}
