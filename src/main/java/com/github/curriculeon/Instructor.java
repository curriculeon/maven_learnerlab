package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    public void teach(Learner learner, double numberOfHours) {

        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for(int i=0;i<learners.length;i++)
        {
            learners[i].learn(numberOfHoursPerLearner);
        }
    }
}


