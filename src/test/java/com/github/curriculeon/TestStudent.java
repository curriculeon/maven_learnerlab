package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student();
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student();
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student();
        double expectedNumberOfHours = 2.5;
        student.learn(expectedNumberOfHours);
        double actualNumberOfHours = student.getTotalStudyTime();
        Assert.assertEquals(expectedNumberOfHours, actualNumberOfHours, 0.1);

    }


}
