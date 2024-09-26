package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    public Instructor() {
    }

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        Double numberOfHoursLearned = numberOfHours / learners.length;

        for (int i = 0; i < learners.length; i++) {
            this.teach(learners[i], numberOfHoursLearned);
        }

    }
}
