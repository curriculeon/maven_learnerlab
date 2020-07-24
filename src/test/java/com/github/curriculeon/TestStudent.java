package com.github.curriculeon;

import org.junit.Test;
import org.junit.Assert;

public class TestStudent {

    @Test
    public void testImplementation() {
        // given
        Student student = new Student(-1, null);

        // when
        Boolean outcome = student instanceof Learner;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testInheritance(){
        // given
        Student student = new Student(-1, null);

        // when
       Boolean outcome = student instanceof Person;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testLearn() {

        // given
        final double DELTA = 1e-15;
        double expectedTotalStudyTime = 12D;
        double expectedNumberOfHours = 12D;

        // when
        Student student = new Student(-1, null);
        student.learn(expectedNumberOfHours);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime,DELTA);
    }
}
