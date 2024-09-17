package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON(new Instructor(1, "Leon"), 0),
    ALI(new Instructor(2, "Ali"), 0),
    LENNY(new Instructor(3, "Lenny"), 0);

    final Instructor instructor;
    double timeWorked;

    Educator(Instructor instructor, double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked += timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.setTimeWorked((numberOfHours));
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/learners.length;

        for (Learner l : learners) {
            teach(l, numberOfHoursPerLearner);
        }

    }
}
