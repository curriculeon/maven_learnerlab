package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestClassroom {


    @Test
    public void testHostLecture(){
        //Given
        Classroom classroom = Classroom.getClassroom();
        Teacher teacher = Instructors.getINSTANCE().findById(2l);

        //When
        classroom.hostLecture(studentId, expected);


        //Then
        Assert.assertEquals(expected);

    }
}
