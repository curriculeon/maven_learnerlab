package com.github.curriculeon;

import org.junit.Test;

public class StudentsTest {
    
    @Test
    public void studentInStudentsTest(){
        //given
        Students students = Students.getInstance();
        
        //when
        Student newStudent = new Student(99, "Tom");
        
        //then
        students.contains(newStudent);
    }
}
