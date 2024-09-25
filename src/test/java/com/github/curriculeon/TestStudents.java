package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test(){
        //Given
        Students students = Students.getINSTANCE();
        String expectedStudentName = "David";


        //Then
         String actual = students.findById(15l).getName();
        //When
        Assert.assertEquals(expectedStudentName, actual);
    }
}
