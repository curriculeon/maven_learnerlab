package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON ( 1,"Leon"),
    HASEEB(2,"Haseeb");
    private final Instructor teacher;
    private double timeWorked = 0;

    Educator(long id, String name) {
       teacher = new Instructor(id,name);
        Instructors instructors = Instructors.getINSTANCE();
        instructors.add(teacher);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.teacher.teach(learner,numberOfHours);
        timeWorked+=numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.teacher.lecture(learners,numberOfHours);
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
