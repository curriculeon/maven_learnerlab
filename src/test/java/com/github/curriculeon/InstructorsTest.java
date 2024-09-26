package com.github.curriculeon;

import org.junit.Test;

public class InstructorsTest {
    
    @Test
    public void instructorInInstructorsTest(){
        //given
        Instructors instructors = Instructors.getInstance();
        
        //when
        Instructor newInstructor = new Instructor(99, "Tom");
        
        //then
        instructors.contains(newInstructor);
    }
}
