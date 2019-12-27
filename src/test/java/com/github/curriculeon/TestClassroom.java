package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class TestClassroom {
    @Test
    public void testHostLecture()
    {
        //given
        Classroom classroom = Classroom.getInstance();
        Students students = Students.getInstance();
        Iterator iterator = students.iterator();

        //when
        classroom.hostLecture(1, 10);

        //then
        while (iterator.hasNext()) {

            Student student = (Student) iterator.next();
            Assert.assertEquals(student.getTotalStudyTime(), classroom.getStudyMap().get(student), 0);
        }
    }
}
