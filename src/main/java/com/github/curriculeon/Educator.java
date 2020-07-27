package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Educator implements Teacher{
    MATH_INSTRUCTOR;
    
    //Attributes
    private final Map<Educator, Instructors> educatorToInstructors = new HashMap<>();
    private final Map<Educator, Double> educatorToTimeWorked = new HashMap<>();
    
    //Start Constructors
    private Educator(){
        educatorToInstructors.put(this, Instructors.getInstance());
    }
    
    @Override
    public void teach(Learner learner, double numberOfHours) {
        educatorToTimeWorked.compute()
    }
    
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
    
    }
    //End Constructors
}
