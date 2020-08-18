package com.github.curriculeon;

public enum Educator implements Teacher {
    LEON,
    HASEEB;

    private Double hoursWorked;
    private final Instructor instructor;

    Educator() {
        long id = this.ordinal();
        String name = this.name();
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        hoursWorked = numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        hoursWorked += numberOfHours;
    }
}
