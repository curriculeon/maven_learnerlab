package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor test = new Instructor(1, "Leon");

        Assert.assertTrue(test instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor test = new Instructor(1, "Leon");

        Assert.assertTrue(test instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor leon = new Instructor(1, "Leon");

        Student mary = new Student(1, "Mary");

        leon.teach(mary, 4.5);

        double expected = 4.5;
        double actual = mary.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }
}
