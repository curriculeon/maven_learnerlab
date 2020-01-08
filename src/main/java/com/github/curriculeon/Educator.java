package com.github.curriculeon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Educator implements Teacher {

    Abbott(1,"Abbott", 5),
    Apollo(2,"Apollo", 3),
    Armani(3,"Armani", 8),
    Aristotle(4,"Aristotle", 9),
    Arrow(5,"Arrow", 6);
    Instructor instructor;
    double timeWorked;
    Educator(long id, String name, double totalTimeWorked){
     this.instructor =new Instructor(id, name);
     this.timeWorked = totalTimeWorked;
    }
    Educator() {
        this.instructor =null;
        this.timeWorked = 0.0;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }
}
