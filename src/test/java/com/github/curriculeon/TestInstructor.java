package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        //Given

        Instructor instructor = new Instructor(0L, "some Name");

        // When
        boolean assertion = instructor instanceof Teacher;

        // Then
        Assert.assertTrue(assertion);

    }

    @Test
    public void testInheritance () {
        //Given

        Instructor instructor = new Instructor(0L, "some Name");

        // When
        boolean assertion = instructor instanceof Person;

        // Then
        Assert.assertTrue(assertion);

    }

    @Test
    public void testInheritance () {
        //Given

        Instructor instructor = new Instructor(0L, "some Name");

        // When
        boolean assertion = instructor instanceof Person;

        // Then
        Assert.assertTrue(assertion);

    }
}
