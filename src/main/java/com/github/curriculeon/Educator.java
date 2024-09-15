package com.github.curriculeon;

public enum Educator implements Teacher {
    LEON,
    HASEEB;
    private Double hoursWorked;
    private final Instructor instructor;

    Educator() {
        long id = this.ordinal(); //inherited from 'Enum' implicit super class
        String name = this.name(); //inherited from 'Enum' implicit super class
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
    }
    @Override
    public void teach(Learner learner, Double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        hoursWorked += numberOfHours;
    }
    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        hoursWorked += numberOfHours;
    }
}

    /*Create an enum named Educator.
        The enum should implement Teacher.
        The enum should have an enumeration for each of the instructors represented in the Instructors class.
        Upon construction each enumeration of the enum should instantiate a respective Instructor and assign it to a final instructor field upon construction. The instructor should be added to the Instructors singleton.
        Calls to the teach and lecture method should be deferred to the composite instructor reference.
        The enum should have a double timeWorked field which keeps track of the hours that the Educator has taught.*/