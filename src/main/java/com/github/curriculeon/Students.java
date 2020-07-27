package com.github.curriculeon;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Students extends People<Student>{
    
    //Attributes
    private static final Students INSTANCE = new Students();
    public static final AtomicLong ID_GENERATOR = new AtomicLong();
    
    //Start Constructors
    private Students(){}
    //End Constructors
    
    //Start Methods
    public static Students getInstance(){
        return INSTANCE;
    }
    
    @Override
    public Student[] toArray() {
        return super.toArray(new Student[INSTANCE.count()]);
    }
    //End Methods
}
