package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation() {
        //given
        Learner student = new Student();

        //when
        Boolean result = student instanceof Person;

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testInheritance() {

        //given
        Learner student = new Student();

        //when
        Boolean result = student instanceof Person;

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testLearn() {
        //given
        Learner student = new Student();
        Double actualNumberOfHours = 98D;

        //when
        student.learn(actualNumberOfHours);
        Double actualTotalStudyTime = student.getTotalStudyTime();

        //then
        Double expectedTotalStudyTime = 98D;
        Assert.assertEquals(actualTotalStudyTime, expectedTotalStudyTime);
    }
}
