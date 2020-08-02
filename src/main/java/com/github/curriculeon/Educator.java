package com.github.curriculeon;

public enum Educator implements Teacher {

    LEON,
    HASEEB;

    private Double timeWorked;
    private final Instructor instructor;

    Educator(){
        long id = this.ordinal();
        String name = this.name();// get instructors name.
        this.instructor = new Instructor(id, name);
        Instructors.getINSTANCE().add(instructor);
    }

    ;
    @Override
    public void teach(Learner learner, Double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
