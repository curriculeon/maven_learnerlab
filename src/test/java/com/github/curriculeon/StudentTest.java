package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    //Start Methods
    @Test
    public void implementationTest(){
        //given
        int id = 0;
        String name = "Bob";
        Student student = new Student(id, name);

        //then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        //given
        int id = 0;
        String name = "Bob";
        Student student = new Student(id, name);
        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest(){
        //given
        int id = 0;
        String name = "Bob";
        Student student = new Student(id, name);
        int studyTime = 5;
        Double previousTotalStudyTime = student.getTotalStudyTime();

        //when
        student.learner(studyTime);

        //then
        Assert.assertEquals(previousTotalStudyTime + 5, student.getTotalStudyTime().doubleValue(), .000001);
    }

    //End Methods
}
