package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON,
    HUNTER;

    private Teacher teacher;

    private double timeWorked;

    Educator(){
        this.teacher = Instructors.getInstance().findByName(name());
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        teacher.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        teacher.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}
