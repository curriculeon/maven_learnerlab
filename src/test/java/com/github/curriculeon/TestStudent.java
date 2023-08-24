package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student test = new Student(1L, "Andrew");

        Assert.assertTrue(test instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student test = new Student(1L, "Jarek");

        Assert.assertTrue(test instanceof Person);
    }

    @Test
    public void testLearn(){
        Student test = new Student(1L, "Mary");

        test.learn(12.0);

        double expected = 12.0;
        double actual = test.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }
}
