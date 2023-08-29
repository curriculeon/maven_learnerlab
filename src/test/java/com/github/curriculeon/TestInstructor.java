package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor test = new Instructor(1L, "Leon");

        Assert.assertTrue(test instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor test = new Instructor(1L, "Leon");

        Assert.assertTrue(test instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor leon = new Instructor(1L, "Leon");

        Student mary = new Student(1L, "Mary");

        leon.teach(mary, 4.5);

        double expected = 4.5;
        double actual = mary.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture(){
        Instructor leon = new Instructor(1L, "Leon");

        Student mary = new Student(1L, "Mary");
        Student jarek = new Student(2L, "Jarek");
        Student andrew = new Student(3L, "Andrew");

        Learner[] learners = {mary, jarek, andrew};

        leon.lecture(learners, 9.0);

        double expected = 3.0;
        double actual = andrew.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.01);
    }
}
