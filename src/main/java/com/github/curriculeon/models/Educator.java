package com.github.curriculeon.models;

import com.github.curriculeon.interfaces.Learner;
import com.github.curriculeon.interfaces.Teacher;

public enum Educator implements Teacher {
    LEON_HUNTER,
    FRED_ZIRDUNG,
    DAVID_SMELSER;

    private final Instructor instructor;
    private double timeWorked;

    Educator() {
        this.instructor = new Instructor((long)ordinal(), name()) {
            @Override
            public void teach(Learner learner, double numberOfHours) {
                super.teach(learner, numberOfHours);
                Educator.this.timeWorked += numberOfHours;
            }
        };
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public String toString() {
        return "Educator{" +
                "instructor=" + instructor +
                '}';
    }
}
