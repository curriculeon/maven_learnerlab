package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        //Given
       Student student = new Student(0L, "some Name", 1.1);

        // When
        boolean assertion = student instanceof Learner;

        // Then
        Assert.assertTrue(assertion);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(0L, "some Name", 1.1);

        // When
        boolean assertion = student instanceof Person;

        // Then
        Assert.assertTrue(assertion);
    }
    @Test

    public void testLearn() {
        //Given
        Student student = new Student(0L, "some Name", 1.1);

        // When
        student.learn(2);
        double actualHours = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(3.1, actualHours,  0.001);
    }
}
