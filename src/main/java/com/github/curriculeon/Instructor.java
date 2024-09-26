package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours/learners.length;
        for (int count = 0; count < learners.length; count++){
            learners[count].learn(numberOfHoursPerStudent);
        }
    }
}
