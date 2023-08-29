package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //given
        Student student = new Student(null, null);

        //when
        boolean isLearner = student instanceof Learner;

        //then
        Assert.assertTrue(isLearner);
    }

    @Test
    public void testInheritance(){
        //given
        Student student = new Student(null, null);

        //when
        boolean isPerson = student instanceof Person;

        //then
        Assert.assertTrue(isPerson);
    }

    @Test
    public void testLearn(){
        //given
        Student student = new Student(null, null);
        double preStudyTime = student.getTotalStudyTime();
        double numberOfHours = 100.0;
        double expectedTotalStudyTime = preStudyTime + numberOfHours;

        //when
        student.learn(numberOfHours);

        //then
        Assert.assertEquals(expectedTotalStudyTime, student.getTotalStudyTime(), 0.001);

    }
}
