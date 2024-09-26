package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    //Attributes

    //Start Constructor
    public Instructor(long id, String name) {
        super(id, name);
        Instructors.getInstance().add(this);
    }
    //End Constructor

    //Start Methods
    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learner(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            teach(learner, numberOfHoursPerLearner);
        }
    }
    //End Methods
}
