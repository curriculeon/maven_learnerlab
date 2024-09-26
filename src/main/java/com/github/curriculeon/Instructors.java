package com.github.curriculeon;

import java.util.concurrent.atomic.AtomicLong;

public class Instructors extends People<Instructor>{
    
    //Attributes
    private static final Instructors INSTANCE = new Instructors();
    public static final AtomicLong ID_GENERATOR = new AtomicLong();
    
    //Start Constructors
    private Instructors(){}
    //End Constructors
    
    //Start Methods
    public static Instructors getInstance(){
        return INSTANCE;
    }
    
    @Override
    public Instructor[] toArray() {
        return super.toArray(new Instructor[INSTANCE.count()]);
    }
    //End Methods
}
