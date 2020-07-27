package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Educator implements Teacher{
    MATH_INSTRUCTOR(0);
    
    //Attributes
    private final Instructor instructor;
    private double totalHoursWorked = 0;
    
    //Start Constructors
    private Educator(int instructorId){
        this.instructor = new Instructor(instructorId, "Tom");
    }
    
    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        totalHoursWorked += numberOfHours;
    }
    
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        totalHoursWorked += numberOfHours;
    }
    
    public double getTotalHoursWorked(){
        return totalHoursWorked;
    }
    //End Constructors
}
