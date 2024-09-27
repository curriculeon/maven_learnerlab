package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        //Given
       Student student = new Student(0L, "some Name");

        // When
        boolean assertion = student instanceof Learner;

        // Then
        Assert.assertTrue(assertion);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(0L, "some Name");

        // When
        boolean assertion = student instanceof Person;

        // Then
        Assert.assertTrue(assertion);
    }

    @Test
    public void testLearn() {
        //Given
        Student student = new Student(0L, "some Name");

        // When
        student.learn(2.0);
        student.learn(2.0);
        double actualHours = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(4.0, actualHours,  0.001);
    }
}
