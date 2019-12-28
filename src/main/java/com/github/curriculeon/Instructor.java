package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    private double timeWorked;

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for (Learner learner: learners)
            learner.learn(numberOfHoursPerLearner);

        timeWorked += numberOfHours;
    }
}
