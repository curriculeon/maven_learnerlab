package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON ( 1,"Leon",0),
    HASEEB(2,"Haseeb",0);
    private final long id;
    private final String name;
    private final Instructor teacher;
    private double timeWorked = 0;

    Educator(long id, String name,double timeWorked) {
        this.id = id;
        this.name = name;
        teacher = new Instructor(id,name);
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

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
