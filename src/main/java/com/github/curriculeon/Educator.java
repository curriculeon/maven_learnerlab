package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON,
    HUNTER;


    private double timeWorked;

    @Override
    public void teach(Learner learner, double numberOfHours) {
        getTeacher().teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        getTeacher().lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public double getTimeWorked(){
        return timeWorked;
    }

    private Teacher getTeacher() {
        return Instructors.getInstance().findByName(name().toUpperCase());
    }
}
