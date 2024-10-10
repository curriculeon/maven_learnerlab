package com.github.curriculeon;

public enum Educator implements Teacher {
    PROFESSORPEEP;

    private Double hoursWorked;
    private final Instructor instructor;

    Educator() {
        long id = this.ordinal(); // inherited from `Enum` implicit super class
        String name = this.name();  // inherited from `Enum` implicit super class
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        hoursWorked += numberOfHours;

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        hoursWorked += numberOfHours;

    }
}
